object DependenciesNPM {

  object Versions {
    val reactV               = "17.0.2"
    val reactSwipeableViewsV = "0.14.0"
  }

  import Versions._

  // A -> Z
  val emotionCore                   = "@emotion/core"                      -> "10.3.1"
  val emotionReact                  = "@emotion/react"                     -> "11.7.1"
  val emotionStyled                 = "@emotion/styled"                    -> "10.3.0"
  val materialUiCore                = "@mui/material"                      -> "5.2.7"
  val materialUiIcons               = "@mui/icons-material"                -> "5.2.5"
  val materialUiLab                 = "@mui/lab"                           -> "5.0.0-alpha.63"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> "17.0.38"
  val typesReactDom                 = "@types/react-dom"                   -> "17.0.11"
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.1"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.3"

}
