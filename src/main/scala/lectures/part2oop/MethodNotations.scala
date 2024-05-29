package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hello, my name is $name and I like movie $favoriteMovie"
    def apply(n: Int): String = s"$name whatched $favoriteMovie $n times"
    def learns(things: String) = s"$name is learning $things"
    def learnsScala = this.learns("scala")
  }

  val mary = new Person("Mary", "Inception")
  val tom = new Person("Tom", "Flash")

  println(mary + tom)
  println(mary.+(tom))

  println(tom.likes("Flash"))

  println(mary.likes("Inceptio"))
  println(mary likes "Inception") //equivalent
  //infix Notation = operator notation

  //Prefix Notation
  val x = -1
  val y = 1.unary_-
  //unary_prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  //prefix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply

  println(mary.apply())
  println(mary())

  /*
      1.  Overload the + operator
          mary + "the rockstar" => new person "Mary (the rockstar)"

      2.  Add an age to the Person class
          Add a unary + operator => new person with the age + 1
          +mary => mary with the age incrementer

      3.  Add a "learns" method in the Person class => "Mary learns Scala"
          Add a learnsScala method, calls learns method with "Scala".
          Use it in postfix notation.

      4.  Overload the apply method
          mary.apply(2) => "Mary watched Inception 2 times"
     */

  //println((mary + "The rockstar").apply())
  println((mary + "The rockstar")())
  println((+mary).age)
  println(mary learnsScala)
  //println(mary.apply(10))
  println(mary(10))
  }