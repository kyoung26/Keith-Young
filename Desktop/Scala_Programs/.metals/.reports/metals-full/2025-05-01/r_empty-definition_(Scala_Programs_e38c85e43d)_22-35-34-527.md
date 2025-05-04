error id: 
file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/budget.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 405
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

 */


import scala.io.StdIn.readLine
import scala.io.StdIn


@main def start() = 
    val user1 = Person(s"enter @@a name:  + StdIn.readLine())
    //println(user1.income(StdIn.readLine().toInt, "Month" + StdIn.readLine().toLowerCase()))
    


sealed trait Budget

case class Person(name: String) extends Budget:


   /* def month(month: "January"): (String) =
        month
*/
    def income(x:Double, Month: String): (Double, Double, Double, String)=
        val needs = x * 0.5
        val wants = x * 0.3
        val save = x * 0.2
        val month = Month
        (needs, wants, save, month)




```


#### Short summary: 

empty definition using pc, found symbol in pc: 