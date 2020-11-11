package io.kinoplan.demo.models.Buttons

import scalacss.internal.StyleA

import io.kinoplan.scalajs.react.bridge.WithProps
import io.kinoplan.scalajs.react.material.ui.core.MuiFab

case class Fab(
  color: MuiFab.Color.Value,
  className: StyleA,
  icon: WithProps
)
