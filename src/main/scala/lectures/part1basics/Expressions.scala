package lectures.part1basics

object Expressions extends App{

  val aCondition = false
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)

  var aVariable = 2
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  //Code Blocks
  //Podemos definir valores, escrever expressôes e assim por diante
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }// roadblock

  val someValue = { //Boolean
    2 < 3
  }

  val someOtherValue = { //Int
    if(someValue) 234 else 987
    42
  }
}
