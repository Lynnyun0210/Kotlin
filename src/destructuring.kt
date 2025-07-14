import jdk.internal.org.jline.keymap.KeyMap.key

data class Person(val name: String, val age: Int)
data class Letter(val first: Char,val second:Char,val third:Char)
fun main(){
    val person=Person("Alice",25)
    val (name,age)=person
    println("$name is $age yerars old")
    val list= Letter('a','b','c')
    val (first,second,_)=list
    println("$first,$second")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    map.forEach { (key,value)-> println("Key: $key, Value: $value") }

}
//destructuring
/**
 * Kotlin会为数据自动生成ComponentN（）方法，解构的本质就是调用这些方法
 * val name = person.component1()  // 等价于 person.name
 * val age = person.component2()   // 等价于 person.age
 */

