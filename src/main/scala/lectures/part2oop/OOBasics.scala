package lectures.part2oop

object OOBasics extends App{

 val person = new Person("Samuel", 25)
 println(person.x)
 person.greet("Daniel")
}

//constructor
class Person(name: String, age: Int) {

  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // Multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}

