package io.kinoplan.demo.components.demos.Cards

import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import scalacss.ScalaCssReactImplicits

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Cards.{DefaultRecipeReviewCardStyle, RecipeReviewCardStyle}
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}

object RecipeReviewCard extends ScalaCssReactImplicits {
  case class Props(style: RecipeReviewCardStyle)

  case class State(expanded: Boolean = false) {
    def handleExpandClick = copy(expanded = !expanded)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleExpandClick = t.modState(_.handleExpandClick)

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val expandOpen = if (state.expanded) css.expandOpen else css.common.emptyStyle

      div(
        ComponentContainer("Complex Interaction")(
          MuiCard()(css.card,
            MuiCardHeader(
              avatar = VdomNode(MuiAvatar()(css.avatar,
                aria.label := "Recipe",
                "R"
              ).rawNode),
              action = MuiIconButton()(
                MuiIcons(MuiIconsModule.MoreVert)()
              ),
              title = VdomNode("Shrimp and Chorizo Paella"),
              subheader = VdomNode("September 14, 2016")
            ),
            MuiCardMedia(image = "/static/images/cards/paella.jpg")(css.media,
              title := "Paella dish"
            ),
            MuiCardContent()(
              MuiTypography(component = "p")(
                " This impressive paella is a perfect party dish and a fun meal to cook together with your " +
                "guests. Add 1 cup of frozen peas along with the mussels, if you like."
              )
            ),
            MuiCardActions(disableActionSpacing = true)(css.actions,
              MuiIconButton()(
                aria.label := "Add to favorites",
                MuiIcons(MuiIconsModule.Favorite)()
              ),
              MuiIconButton()(
                aria.label := "Share",
                MuiIcons(MuiIconsModule.Share)()
              ),
              MuiIconButton()(css.expand, expandOpen,
                aria.label := "Show more",
                aria.expanded := state.expanded,
                onClick --> handleExpandClick,
                MuiIcons(MuiIconsModule.ExpandMore)()
              )
            ),
            MuiCollapse(in = state.expanded, timeout = MuiCollapse.Timeout.auto, unmountOnExit = true)(
              MuiCardContent()(
                MuiTypography(paragraph = true)("Method:"),
                MuiTypography(paragraph = true)(
                  "Heat 1/2 cup of the broth in a pot until simmering, add saffron and set aside for 10 minutes."
                ),
                MuiTypography(paragraph = true)(
                  "Heat oil in a (14- to 16-inch) paella pan or a large, deep skillet over medium-high " +
                  "heat. Add chicken, shrimp and chorizo, and cook, stirring occasionally until lightly " +
                  "browned, 6 to 8 minutes. Transfer shrimp to a large plate and set aside, leaving " +
                  "chicken and chorizo in the pan. Add pimentón, bay leaves, garlic, tomatoes, onion, " +
                  "salt and pepper, and cook, stirring often until thickened and fragrant, about 10 " +
                  "minutes. Add saffron broth and remaining 4 1/2 cups chicken broth; bring to a boil."
                ),
                MuiTypography(paragraph = true)(
                  "Add rice and stir very gently to distribute. Top with artichokes and peppers, and cook " +
                  "without stirring, until most of the liquid is absorbed, 15 to 18 minutes. Reduce heat " +
                  "to medium-low, add reserved shrimp and mussels, tucking them down into the rice, and " +
                  "cook again without stirring, until mussels have opened and rice is just tender, 5 to 7 " +
                  "minutes more. (Discard any mussels that don’t open.)"
                ),
                MuiTypography()(
                  "Set aside off of the heat to let rest for 10 minutes, and then serve."
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("RecipeReviewCard")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: RecipeReviewCardStyle = DefaultRecipeReviewCardStyle) = component(Props(style))
}
