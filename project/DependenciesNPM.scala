object DependenciesNPM {

  object Versions {
    val reactV = "17.0.2"
    val reactSwipeableViewsV = "0.14.0"
  }

  import Versions._

  //A -> Z
  val materialUiCore                = "@material-ui/core"                  -> "4.11.4"
  val materialUiIcons               = "@material-ui/icons"                 -> "4.11.2"
  val materialUiLab                 = "@material-ui/lab"                   -> "4.0.0-alpha.58"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> reactV
  val typesReactDom                 = "@types/react-dom"                   -> reactV
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.0"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.2"
}
