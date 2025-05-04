file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/practice.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 250
uri: file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/practice.scala
text:
```scala
import scala.io.StdIn.readLine




@main def begin() =
    val salaries = Seq(20_000, 70_000, 40_000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(_ * 2)
    println(newSalaries)

    val operation = Combine[@@]


trait Combine[A]:
    def combine(x: A, y: A): Option[A]

object Combine:
    given Combine[Int] with
        def combine(x: Int, y: Int): Int => (x + y)
    given Combine[String] with
        def combine(x: String, y: String): String => (x + y)
end Combine





```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1