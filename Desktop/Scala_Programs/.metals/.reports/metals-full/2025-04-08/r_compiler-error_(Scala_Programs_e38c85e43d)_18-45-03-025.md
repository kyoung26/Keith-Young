file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/practice.scala
### java.lang.AssertionError: assertion failed: NoType

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 297
uri: file:///C:/Users/Keith%20Young/Desktop/Scala_Programs/practice.scala
text:
```scala
import scala.io.StdIn.readLine

import scala.util.matching.Regex


@main def begin() =
    val search = """(\d{3})""".r
    val message = "hbdjg2ibbn356fdjsccdh c"
    val find = search.findFirstIn(message)
    val switch = """(\d{2})"""
    val switched = message.replaceAll(search, _ m@@)
    println("Numbers found: " + find)

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Types$TypeBounds.<init>(Types.scala:5557)
	dotty.tools.dotc.core.Types$AliasingBounds.<init>(Types.scala:5636)
	dotty.tools.dotc.core.Types$TypeAlias.<init>(Types.scala:5661)
	dotty.tools.dotc.core.Types$TypeAlias$.apply(Types.scala:5700)
	dotty.tools.dotc.core.Types$Type.bounds(Types.scala:1857)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:280)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:349)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: NoType