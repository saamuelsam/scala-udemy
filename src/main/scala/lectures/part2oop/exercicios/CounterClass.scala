package lectures.part2oop.exercicios

object CounterClass extends App{

  val counter = new Counter //Cria uma instância de Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.dec(0).print
}


class Counter(val count: Int = 0) { //val count: count é um valor imutável. Uma vez definido, ele não pode ser alterado.

  def inc: Counter = {
    println("incrementing")
    new Counter(count + 1) //immutability
  }

  def dec: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = { //if (n <= 0) this: Se n for menor ou igual a 0, retorna a instância atual (this). Isto é um caso base para a recursão.
    if(n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)

  }
  def print: Unit = println(count)
}