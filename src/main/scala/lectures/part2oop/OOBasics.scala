package lectures.part2oop

object OOBasics extends App{
 
  val person = new Person("Samuel", 25)
    println(person.x)
    person.greet("Daniel")
}


//constructor
class Person(name: String, age: Int) {
  /*uma classe organiza dados e comportamentos que são código e instanciação significa realizações concretas e memória que
  são espaços de memória reais que estão em conformidade com o código e a estrutura de dados que
  a classe descreve.*/
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