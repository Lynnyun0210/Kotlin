fun main(){
    val state=listOf(
        NetworkState.Success("Hello"),
        NetworkState.Error(404,"Not found"),
        NetworkState.Loading
    )
    state.forEach { handleState(it)}

}
//密封类
sealed class NetworkState{
    data class Success(val data:String):NetworkState()
    data class Error(val code: Int,val message:String):NetworkState()
    object Loading:NetworkState()
    //数据类子类继承自密封类NetworkState
    //Object继承自密封类？
}
fun handleState(state:NetworkState)= when(state){
    is NetworkState.Success->println("Data:${state.data}")
    is NetworkState.Error->println("Error${state.code}:${state.message}")
    NetworkState.Loading -> println("Loading…")
}