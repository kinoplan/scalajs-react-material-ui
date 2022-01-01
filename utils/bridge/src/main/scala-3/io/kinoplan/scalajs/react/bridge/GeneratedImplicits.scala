package io.kinoplan.scalajs.react.bridge

package io.kinoplan.scalajs.react.bridge

import scala.scalajs.js
import scala.scalajs.js.Any.*

trait GeneratedImplicits {

  implicit def function0Writer[R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function0[R]] = new JsWriter[Function0[R]] {
    def toJs(value: Function0[R]): js.Any = fromFunction0(() => writerR.toJs(value()))
  }

  implicit def function1Writer[T1, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function1[T1, R]] = new JsWriter[Function1[T1, R]] {
    override def toJs(value: Function1[T1, R]): js.Any = fromFunction1((x1: T1) => writerR.toJs(value(x1)))
  }

  implicit def function2Writer[T1, T2, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function2[T1, T2, R]] = new JsWriter[Function2[T1, T2, R]] {

    override def toJs(value: Function2[T1, T2, R]): js.Any =
      fromFunction2((x1: T1, x2: T2) => writerR.toJs(value(x1, x2)))

  }

  implicit def function3Writer[T1, T2, T3, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function3[T1, T2, T3, R]] = new JsWriter[Function3[T1, T2, T3, R]] {

    override def toJs(value: Function3[T1, T2, T3, R]): js.Any =
      fromFunction3((x1: T1, x2: T2, x3: T3) => writerR.toJs(value(x1, x2, x3)))

  }

  implicit def function4Writer[T1, T2, T3, T4, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function4[T1, T2, T3, T4, R]] = new JsWriter[Function4[T1, T2, T3, T4, R]] {

    override def toJs(value: Function4[T1, T2, T3, T4, R]): js.Any =
      fromFunction4((x1: T1, x2: T2, x3: T3, x4: T4) => writerR.toJs(value(x1, x2, x3, x4)))

  }

  implicit def function5Writer[T1, T2, T3, T4, T5, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function5[T1, T2, T3, T4, T5, R]] = new JsWriter[Function5[T1, T2, T3, T4, T5, R]] {

    override def toJs(value: Function5[T1, T2, T3, T4, T5, R]): js.Any =
      fromFunction5((x1: T1, x2: T2, x3: T3, x4: T4, x5: T5) => writerR.toJs(value(x1, x2, x3, x4, x5)))

  }

  implicit def function6Writer[T1, T2, T3, T4, T5, T6, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function6[T1, T2, T3, T4, T5, T6, R]] = new JsWriter[Function6[T1, T2, T3, T4, T5, T6, R]] {

    override def toJs(value: Function6[T1, T2, T3, T4, T5, T6, R]): js.Any =
      fromFunction6((x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6) => writerR.toJs(value(x1, x2, x3, x4, x5, x6)))

  }

  implicit def function7Writer[T1, T2, T3, T4, T5, T6, T7, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function7[T1, T2, T3, T4, T5, T6, T7, R]] = new JsWriter[Function7[T1, T2, T3, T4, T5, T6, T7, R]] {

    override def toJs(value: Function7[T1, T2, T3, T4, T5, T6, T7, R]): js.Any = fromFunction7(
      (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7) => writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7))
    )

  }

  implicit def function8Writer[T1, T2, T3, T4, T5, T6, T7, T8, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]] =
    new JsWriter[Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]] {

      override def toJs(value: Function8[T1, T2, T3, T4, T5, T6, T7, T8, R]): js.Any = fromFunction8(
        (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8) =>
          writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8))
      )

    }

  implicit def function9Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]] =
    new JsWriter[Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]] {

      override def toJs(value: Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]): js.Any = fromFunction9(
        (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8, x9: T9) =>
          writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9))
      )

    }

  implicit def function10Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]] =
    new JsWriter[Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]] {

      override def toJs(value: Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]): js.Any = fromFunction10(
        (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8, x9: T9, x10: T10) =>
          writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10))
      )

    }

  implicit def function11Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]] =
    new JsWriter[Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]] {

      override def toJs(value: Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]): js.Any = fromFunction11(
        (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8, x9: T9, x10: T10, x11: T11) =>
          writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11))
      )

    }

  implicit def function12Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]] =
    new JsWriter[Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]] {

      override def toJs(value: Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]): js.Any =
        fromFunction12(
          (x1: T1, x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8, x9: T9, x10: T10, x11: T11, x12: T12) =>
            writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12))
        )

    }

  implicit def function13Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] =
    new JsWriter[Function13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]] {

      override def toJs(value: Function13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]): js.Any =
        fromFunction13(
          (
            x1: T1,
            x2: T2,
            x3: T3,
            x4: T4,
            x5: T5,
            x6: T6,
            x7: T7,
            x8: T8,
            x9: T9,
            x10: T10,
            x11: T11,
            x12: T12,
            x13: T13
          ) => writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13))
        )

    }

  implicit def function14Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]] =
    new JsWriter[Function14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]] {

      override def toJs(value: Function14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]): js.Any =
        fromFunction14(
          (
            x1: T1,
            x2: T2,
            x3: T3,
            x4: T4,
            x5: T5,
            x6: T6,
            x7: T7,
            x8: T8,
            x9: T9,
            x10: T10,
            x11: T11,
            x12: T12,
            x13: T13,
            x14: T14
          ) => writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14))
        )

    }

  implicit def function15Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]] =
    new JsWriter[Function15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]] {

      override def toJs(value: Function15[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        R
      ]): js.Any = fromFunction15(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15
        ) => writerR.toJs(value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15))
      )

    }

  implicit def function16Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]] =
    new JsWriter[Function16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]] {

      override def toJs(value: Function16[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        R
      ]): js.Any = fromFunction16(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16
        ) =>
          writerR.toJs(
            value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16)
          )
      )

    }

  implicit def function17Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]] =
    new JsWriter[Function17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R]] {

      override def toJs(value: Function17[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        R
      ]): js.Any = fromFunction17(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17
        ) =>
          writerR.toJs(
            value(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17)
          )
      )

    }

  implicit def function18Writer[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R](
    implicit
    writerR: JsWriter[R]
  ): JsWriter[Function18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]] =
    new JsWriter[Function18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R]] {

      override def toJs(value: Function18[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18,
        R
      ]): js.Any = fromFunction18(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17,
          x18: T18
        ) =>
          writerR.toJs(
            value(
              x1,
              x2,
              x3,
              x4,
              x5,
              x6,
              x7,
              x8,
              x9,
              x10,
              x11,
              x12,
              x13,
              x14,
              x15,
              x16,
              x17,
              x18
            )
          )
      )

    }

  implicit def function19Writer[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    R
  ](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]] =
    new JsWriter[Function19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R]] {

      override def toJs(value: Function19[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18,
        T19,
        R
      ]): js.Any = fromFunction19(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17,
          x18: T18,
          x19: T19
        ) =>
          writerR.toJs(
            value(
              x1,
              x2,
              x3,
              x4,
              x5,
              x6,
              x7,
              x8,
              x9,
              x10,
              x11,
              x12,
              x13,
              x14,
              x15,
              x16,
              x17,
              x18,
              x19
            )
          )
      )

    }

  implicit def function20Writer[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    R
  ](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]] =
    new JsWriter[Function20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R]] {

      override def toJs(value: Function20[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18,
        T19,
        T20,
        R
      ]): js.Any = fromFunction20(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17,
          x18: T18,
          x19: T19,
          x20: T20
        ) =>
          writerR.toJs(
            value(
              x1,
              x2,
              x3,
              x4,
              x5,
              x6,
              x7,
              x8,
              x9,
              x10,
              x11,
              x12,
              x13,
              x14,
              x15,
              x16,
              x17,
              x18,
              x19,
              x20
            )
          )
      )

    }

  implicit def function21Writer[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    R
  ](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R]] =
    new JsWriter[Function21[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21,
      R
    ]] {

      override def toJs(value: Function21[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18,
        T19,
        T20,
        T21,
        R
      ]): js.Any = fromFunction21(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17,
          x18: T18,
          x19: T19,
          x20: T20,
          x21: T21
        ) =>
          writerR.toJs(
            value(
              x1,
              x2,
              x3,
              x4,
              x5,
              x6,
              x7,
              x8,
              x9,
              x10,
              x11,
              x12,
              x13,
              x14,
              x15,
              x16,
              x17,
              x18,
              x19,
              x20,
              x21
            )
          )
      )

    }

  implicit def function22Writer[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22,
    R
  ](implicit
    writerR: JsWriter[R]
  ): JsWriter[Function22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R]] =
    new JsWriter[Function22[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21,
      T22,
      R
    ]] {

      override def toJs(value: Function22[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18,
        T19,
        T20,
        T21,
        T22,
        R
      ]): js.Any = fromFunction22(
        (
          x1: T1,
          x2: T2,
          x3: T3,
          x4: T4,
          x5: T5,
          x6: T6,
          x7: T7,
          x8: T8,
          x9: T9,
          x10: T10,
          x11: T11,
          x12: T12,
          x13: T13,
          x14: T14,
          x15: T15,
          x16: T16,
          x17: T17,
          x18: T18,
          x19: T19,
          x20: T20,
          x21: T21,
          x22: T22
        ) =>
          writerR.toJs(
            value(
              x1,
              x2,
              x3,
              x4,
              x5,
              x6,
              x7,
              x8,
              x9,
              x10,
              x11,
              x12,
              x13,
              x14,
              x15,
              x16,
              x17,
              x18,
              x19,
              x20,
              x21,
              x22
            )
          )
      )

    }

}
