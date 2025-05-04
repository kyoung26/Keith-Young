error id: scala/Double#
file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/budget.scala
empty definition using pc, found symbol in pc: scala/Double#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Double#
	 -scala/Predef.Double#
offset: 1886
uri: file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/budget.scala
text:
```scala
/* 
- Budget app that sets limits for monthly wage of a person
- Each person has there own personal budget
- Can swap between people
- Frontend?
- 50% needs
- 30% wants
- 20% save
- Pattern matching with the months
- May, June, July spend more money than other months
- Date: 5/3/25
 */
import scala.io.StdIn.readLine
import scala.io.StdIn


@main def start() = 
    println("Enter a name")
    val userNameInput = StdIn.readLine()
    val user1 = Person(userNameInput)
    println("Enter what Month and monthly income")
    //val money = income().monthlyIncome(Month(StdIn.readLine()), StdIn.readLine().toDouble)
    //val userIncome = user1.savings(income().monthlyIncome())
    println(s"Your name is saved as $user1")
    


//sealed trait Budget
/* 
    - function for adding money to account
    - function for calculating monthly budget
    - function for calculating items you want to buy

 */
case class Person(name: String):
    val Name = name
    
    def budgetForMonth(money: income): Unit =
        val bankSavings = income().monthlyIncome(Month(StdIn.readLine()), StdIn.readDouble())
    
    // Takes in the income thats set in "class income(x: Double)" and sets a income for the current user in the program
    def incomes(expenses: Double): Unit =
        var expense = income(expenses)
        expense
    
   
//trait Budget
class income():

    private var _income = 0

    def monthlyIncome(month: Month, y: Double): (Double, Double, Double) =
        var needs = y * 0.5
        val wants = y * 0.3
        val save  = y * 0.2
        val time = month.time()
        time match
            case "may" => (y * 0.7, y * 0.2, y * 0.1)
            case "june" => (y * 0.7, y * 0.2, y * 0.1)
            case "july" => (y * 0.7, y * 0.2, y * 0.1)
        (needs, wants, save)

    
    def addIncome(x: D@@ouble, add: Double): Double = 
        var newIncome = x + add
        newIncome
    

    def income_(): Double = _income
    def get_income(newIncome: Double): Double
    def income_: Double = _income

    
    

        
class Month(month: String):
    def time(): String =
        month




```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Double#