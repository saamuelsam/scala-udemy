package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aReapeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aReapeatedFunction(aString, n - 1)
  }

  println(aReapeatedFunction("hello", 4))

  //RECURSIVE FUNCTION //FUNCTIONAL PROGRAMMING
  // WHEN YOU NEED LOOPS, USE RECURSION.
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  //função de saudação para crianças.
  def aGreetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I'am $age years old"
    }
    val results = aGreetingFunction("Samuel", 18)
    println(results)

  //função fatorial
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  val results2 = factorial(5)
  println("O fatorial de 5 é: " + results2)

  // função de Fibonacci.
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(8))

  //uma função que testa se um número é primo.
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(37 * 17))


}
