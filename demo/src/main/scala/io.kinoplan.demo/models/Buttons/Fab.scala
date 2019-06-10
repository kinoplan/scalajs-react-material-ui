package io.kinoplan.demo.models.Buttons

import com.payalabs.scalajs.react.bridge.WithProps
import io.kinoplan.scalajs.react.material.ui.core.MuiFab
import scalacss.internal.StyleA

case class Fab(
  color: MuiFab.Color.Value,
  className: StyleA,
  icon: WithProps
)
