package io.kinoplan.demo.models.Steppers

case class TutorialStep(
  label: String,
  imgPath: String
)

object TutorialStep {
  val default = List(
    TutorialStep(
      label = "San Francisco – Oakland Bay Bridge, United States",
      imgPath = "https://images.unsplash.com/photo-1537944434965-cf4679d1a598?auto=format&fit=crop&w=400&h=250&q=60"
    ),
    TutorialStep(
      label = "Bird",
      imgPath = "https://images.unsplash.com/photo-1538032746644-0212e812a9e7?auto=format&fit=crop&w=400&h=250&q=60"
    ),
    TutorialStep(
      label = "Bali, Indonesia",
      imgPath = "https://images.unsplash.com/photo-1537996194471-e657df975ab4?auto=format&fit=crop&w=400&h=250&q=80"
    ),
    TutorialStep(
      label = "NeONBRAND Digital Marketing, Las Vegas, United States",
      imgPath = "https://images.unsplash.com/photo-1518732714860-b62714ce0c59?auto=format&fit=crop&w=400&h=250&q=60"
    ),
    TutorialStep(
      label = "Goč, Serbia",
      imgPath = "https://images.unsplash.com/photo-1512341689857-198e7e2f3ca8?auto=format&fit=crop&w=400&h=250&q=60"
    )
  )
}
