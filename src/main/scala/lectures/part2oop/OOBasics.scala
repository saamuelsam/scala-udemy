package lectures.part2oop

object OOBasics extends App{
 val writer = new Writer("Julio", "Sousa", 1812)
 println(writer.fullName)
 
  val person = new Person("Samuel", 25)
  println(person.x)
  person.greet("Daniel")


  val novel = new Novel("Great Expectations", 1861, writer)
 println(novel.authorAge)
 println(novel.isWrittenBy(writer))
 println(novel.copy(2020))
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


class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {

  def authorAge = year - author.year // Retorna a idade do autor na época da publicação do romance.
  def isWrittenBy(author: Writer) = author == this.author // Verifica se o romance foi escrito por um autor específico.
  def copy(newYear: Int): Novel = new Novel(name, newYear, author) //Cria uma cópia do romance com um novo ano
  // de publicação, mantendo o mesmo autor.
}

class Counter(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1) //immutability
  }
}
