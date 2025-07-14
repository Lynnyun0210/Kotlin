/**
enum class Direction{
    NORTH,SOUTH,EAST,WEST
}
fun main(){
    val direction=Direction.NORTH
        when(direction){
            Direction.NORTH -> println("Going North")
            Direction.SOUTH->println("Going South")
            Direction.EAST -> println("Going East")
            Direction.WEST -> println("Going West")
    }
}
*/

//枚举常量可以带有属性
/**
enum class Color(val rgb:Int){
    RED(0xFF0000),
    BLUE(0x0000FF),
    GREEN(0x00FF00)
}
fun main(){
    println(Color.RED.rgb)
}
*/
//带方法的枚举
/**
enum class ProtocolState{
   WAITING{
       override fun signal()=TALKING
   },
    TALKING{
        override fun signal()=WAITING
    };
    //枚举常量列表结束，分号分割
    abstract fun signal():ProtocolState//类成员定义
}//这个抽象方法每个枚举常量都应该实现它
fun main(){
    var state=ProtocolState.WAITING
    println(state)
    state=state.signal()
    println(state)
    state=state.signal()
    println(state)
}
*/

//实现接口的枚举
interface Printable{
    fun print()
}
enum class Shape:Printable{
    CIRCLE {
        override fun print() = println("O")
    },
    SQUARE {
        override fun print() = println("P")
    },
    TRIANGLE{
        override fun print() =println("Q")
    }
}
fun main(){
    Shape.CIRCLE.print()
}

//