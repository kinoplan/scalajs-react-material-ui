package io.kinoplan.scalajs.react.material.ui.core.styles

import java.util.concurrent.TimeUnit

import scalacss.DevDefaults._
import scalacss.internal.mutable.StyleSheet

import scala.concurrent.duration.FiniteDuration

case class Transition(
  animatedProps: List[String] = List("all"),
  easing: Transition.easing = Transition.easing.easeInOut,
  duration: Transition.duration.Value = Transition.duration.standard,
  delay: Int = 0
) extends StyleSheet.Inline {
  import dsl._

  def create(
    animatedProps: List[String] = animatedProps,
    easingValue: Transition.easing = easing,
    durationValue: Transition.duration.Value = duration,
    delayValue: Int = delay
  ): StyleA = {
    style(
      transitionProperty := animatedProps.mkString(""),
      transitionDuration(FiniteDuration(durationValue.id.toLong, TimeUnit.MILLISECONDS)),
      transitionTimingFunction.cubicBezier(easingValue.x1, easingValue.y1, easingValue.x2, easingValue.y2),
      transitionDelay(FiniteDuration(delayValue.toLong, TimeUnit.SECONDS))
    )
  }
}

object Transition {
  sealed case class easing(x1: Double, y1: Double, x2: Double, y2: Double)
  // Follow https://material.google.com/motion/duration-easing.html#duration-easing-natural-easing-curves
  // to learn the context in which each easing should be used.
  object easing {
    // This is the most common easing curve.
    object easeInOut extends easing(0.4, 0, 0.2, 1)

    // Objects enter the screen at full velocity from off-screen and
    // slowly decelerate to a resting point.
    object easeOut extends easing(0.0, 0, 0.2, 1)

    // Objects leave the screen at full velocity. They do not decelerate when off-screen.
    object easeIn extends easing(0.4, 0, 1, 1)

    // The sharp curve is used by objects that may return to the screen at any time.
    object sharp extends easing(0.4, 0, 0.6, 1)
  }

  // Follow https://material.io/guidelines/motion/duration-easing.html#duration-easing-common-durations
  // to learn when use what timing
  object duration extends Enumeration {
    val shortest = Value(150)

    val shorter = Value(200)

    val short = Value(250)

    // most basic recommended timing
    val standard = Value(300)

    // this is to be used in complex animations
    val complex = Value(375)

    // recommended when something is entering screen
    val enteringScreen = Value(225)

    // recommended when something is leaving screen
    val leavingScreen = Value(195)
  }
}
