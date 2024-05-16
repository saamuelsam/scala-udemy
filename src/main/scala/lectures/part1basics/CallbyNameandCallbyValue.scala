package lectures.part1basics

object CallbyNameandCallbyValue extends App {

  def calledByValue(x: Long): Unit = {
    println("by Value: " + 139932268245099L)
    println("by Value: " + x)

  }

  def calledByName(x: => Long): Unit = {
    println("by Name: " + x)
    println("by Name: " + x)
  }

  calledByName(139932268245099L)
  calledByValue(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int)= println(x)

  printFirst(infinite(), 34)
  printFirst(34, infinite())
}
