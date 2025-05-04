file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/budget.scala
### java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/Keith Young/Desktop/Scala_Programs/budget.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 921
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
    val userInput = StdIn.readLine()
    val user1 = Person(userInput).name
    println("Enter what Month and monthly income")
    val money = income().monthlyIncome(Month(StdIn.readLine()), StdIn.readLine().toDouble)
    val monthIncome = user1
    println(s"Your name is saved as $user1 and you make $user1.")
    


//sealed trait Budget

case class Person(name: String):
    val Name = name
    
    def savings(money: income): Double =
        val bankSavings = income().monthlyIncome(_, _.@@)
  

   
//trait Budget
class income():
    def monthlyIncome(month: Month , y: Double): (Double, Double, Double) =
        var needs = y * 0.5
        val wants = y * 0.3
        val save  = y * 0.2
        val time = month.time()
        time match
            case "may" => (y * 0.7, y * 0.2, y * 0.1)
        
        (needs, wants, save)


    def sumMonthlyIncome(month: Month, y: Double): (Double, Double, Double) =
        val needs = y * 0.7
        val wants = y * 0.2
        val save = y * 0.1
        //val month = new Month
        (needs, wants, save)

    

        
class Month(month: String):
    def time(): String =
        month




```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.typer.Typer$.assertPositioned(Typer.scala:76)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3657)
	dotty.tools.dotc.typer.Applications.extMethodApply(Applications.scala:2642)
	dotty.tools.dotc.typer.Applications.extMethodApply$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.extMethodApply(Typer.scala:148)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod(Applications.scala:2687)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.tryApplyingExtensionMethod(Typer.scala:148)
	dotty.tools.dotc.interactive.Completion$Completer.tryApplyingReceiverToExtension$1(Completion.scala:561)
	dotty.tools.dotc.interactive.Completion$Completer.$anonfun$23(Completion.scala:604)
	scala.collection.immutable.List.flatMap(List.scala:294)
	scala.collection.immutable.List.flatMap(List.scala:79)
	dotty.tools.dotc.interactive.Completion$Completer.extensionCompletions(Completion.scala:601)
	dotty.tools.dotc.interactive.Completion$Completer.selectionCompletions(Completion.scala:449)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:221)
	dotty.tools.dotc.interactive.Completion$.rawCompletions(Completion.scala:80)
	dotty.tools.pc.completions.Completions.enrichedCompilerCompletions(Completions.scala:114)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:136)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/Keith Young/Desktop/Scala_Programs/budget.scala