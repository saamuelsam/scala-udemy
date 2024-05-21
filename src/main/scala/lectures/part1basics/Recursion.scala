package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1) //chamada recursiva da função //Cada chamada da função recursiva usa o que chamamos de quadro de pilha.
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))
  //  println(factorial(5000))


  /*def anotherFactorial(n: Int): Int = { //Imprime 0, pois o número é astronômico. Utiliza-se (BigInt)
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }*/

  def anotherFactorial(n: Int): BigInt = {
    @tailrec //serve para ter a certeza da função recursiva
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = Use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /*
      anotherFactorial(10) = factHelper(10, 1)
      = factHelper(9, 10 * 1)
      = factHelper(8, 9 * 10 * 1)
      = factHelper(7, 8 * 9 * 10 * 1)
      = ...
      = factHelper(2, 3 * 4 * ... * 10 * 1)
      = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
      = 1 * 2 * 3 * 4 * ... * 10

     */
      println(anotherFactorial(5000))

      //WHEN YOU NEED LOOPS, USE _TAIL _RECURSION.


      /*
      * 1.Concatenate a string n times
      * 2. IsPrime function tail recursive
      * 3. Fibonacci function, tail recursive
      * */
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accummulator: String): String =
      if (n <= 0) accummulator
      else concatenateTailrec(aString, n-1, aString + accummulator)

    println(concatenateTailrec("hello", 5, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
        if (!isStillPrime) false
        else if (t <= 1) true
        else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

      isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))

}
