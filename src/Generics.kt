/**class Box<T>(t : T) {
    var value = t
}
fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Nhooo")
    println(boxInt.value)
    println(boxString.value)
}
*/

fun main(args: Array<String>){
    val age=23
    val name="nhooo"
    val bool=true
    doPrintln(age)
    doPrintln(name)
    doPrintln(bool)
}
fun <T> doPrintln(content:T){
    when(content){
        is Int->println("整型数字为$content")
        is String->println("${content}")
        is Boolean->println("none")
    }
}