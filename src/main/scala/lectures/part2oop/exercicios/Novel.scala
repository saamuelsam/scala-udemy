package lectures.part2oop.exercicios

object Novel extends App {

  val author = new Writer("Julio", "Sousa", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.copy(2020))
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