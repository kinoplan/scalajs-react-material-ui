object DependenciesNPM {

  object Versions {
    val reactV = "16.13.1"
    val reactSwipeableViewsV = "0.13.9"
  }

  import Versions._

  //A -> Z
  val materialUiCore                = "@material-ui/core"                  -> "3.9.0"
  val materialUiIcons               = "@material-ui/icons"                 -> "3.0.2"
  val materialUiLab                 = "@material-ui/lab"                   -> "3.0.0-alpha.30"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> "16.9.42"
  val typesReactDom                 = "@types/react-dom"                   -> "16.9.8"
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.0"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.2"
}
