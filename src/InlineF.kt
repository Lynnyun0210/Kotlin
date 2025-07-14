import java.util.concurrent.locks.Lock

inline fun<T> lock(lock: Lock,body:()->T):T{
    lock.lock()
    try{
        return body()
    }finally {
        lock.unlock()
    }
}
//lock函数是一个典型的内联高阶函数实现
//body:()->T接受一个无参Lambda，返回泛型类型T
//返回值类型 T：与 body Lambda 的返回类型一致
/**当调用这个函数时，编译器会将整个函数体插入到调用处（内联思想）
 * Lambda表达式body也会被内联展开
 * 最终生成的字节码不会有实际的函数调用
 */