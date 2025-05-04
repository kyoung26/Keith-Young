import scala.io.StdIn.readLine


@main def hello() =
  val capitolOne = creditCard("Card", 100,10)

  println(payment(capitolOne))

  //var arr_search = binary_search(Array(1, 2, 3, 4, 6, 7, 8), 5, 0, 6)
  //print(example(36464))

def binary_search(arr: Array[Int], number:Int, low: Int = 0, high: Int): Int = {
  if(low > high)
    return -1


  var mid = low + (high - low) / 2

  if (arr(mid) == number)
  return mid

  else if (arr(mid) < number)
  return binary_search(arr, number, mid + 1, high)


  else
  return binary_search(arr, number, low, mid - 1)
}


trait Transaction

case class cash(paymentType: String, wallet: Int, ammount: Int) extends Transaction

case class debitCard(paymentType: String, balance: Int, amount: Int) extends Transaction

case class creditCard(paymentType: String, balance: Int, amount: Int) extends Transaction


def payment(transaction: Transaction): Int = 
  transaction match
  case cash(_, wallet, amount) =>
    wallet - amount
  case debitCard(_, balance, amount) =>
    balance - amount
  case creditCard(_, balance, amount) if balance == 100 =>
    balance - amount

def example(x:Int): String = x match {

  case 1 => "first case"

  case 2 => "second case"

  case _ => "other case"
}