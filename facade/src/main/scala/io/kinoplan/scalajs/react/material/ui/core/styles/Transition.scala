package io.kinoplan.scalajs.react.material.ui.core.styles

case class Transition(
  animatedProps: List[String] = List("all"),
  easing: Transition.easing.Value = Transition.easing.easeInOut,
  duration: Transition.duration.Value = Transition.duration.standard,
  delay: Int = 0
) {

  def formatMs(value: Int): String = s"${value}ms"

  def create(
    animatedProps: List[String] = animatedProps,
    easingValue: Transition.easing.Value = easing,
    durationValue: Transition.duration.Value = duration,
    delayValue: Int = delay
  ): String = {
    animatedProps.map(animatedProp =>
      List(animatedProp, formatMs(durationValue.id), easingValue, formatMs(delayValue)).mkString(" ")
    ).mkString(",")
  }
}

object Transition {
  // Follow https://material.google.com/motion/duration-easing.html#duration-easing-natural-easing-curves
  // to learn the context in which each easing should be used.
  object easing extends Enumeration {
    // This is the most common easing curve.
    val easeInOut = Value("cubic-bezier(0.4, 0, 0.2, 1)")

    // Objects enter the screen at full velocity from off-screen and
    // slowly decelerate to a resting point.
    val easeOut = Value("cubic-bezier(0.0, 0, 0.2, 1)")

    // Objects leave the screen at full velocity. They do not decelerate when off-screen.
    val easeIn = Value("cubic-bezier(0.4, 0, 1, 1)")

    // The sharp curve is used by objects that may return to the screen at any time.
    val sharp = Value("cubic-bezier(0.4, 0, 0.6, 1)")
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
