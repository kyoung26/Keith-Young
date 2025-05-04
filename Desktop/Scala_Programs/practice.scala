import scala.io.StdIn.readLine

import scala.util.matching.Regex


@main def begin() =
    val search = """(\d{3})""".r
    val message = "hbdjg2ibbn356fdjsccdh c"
    //val find = search.findFirstIn(message)
    val switched = message.replaceAll("b", "i")
    println("Replacement: " + switched)
