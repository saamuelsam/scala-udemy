package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  //VALS ARE IMMUTABLE

  //COMPILER CAN INFER TYPES

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5425425325353523L
  val aFloat: Float = 3.0f
  val aDouble: Double = 1.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
