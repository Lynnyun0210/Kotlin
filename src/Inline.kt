import kotlin.time.Duration
/**
inline class Hours(val value:Int)
inline  class Minutes(val value: Int)

fun schedule(time:Hours){

}
fun wait(duration: Minutes){

}
fun main(){
    schedule(Hours(2))
    wait(Minutes(30))
}
        */
inline class Name(val value: String)
fun main(){
    val name=Name("Lynn")
    print(name)
}