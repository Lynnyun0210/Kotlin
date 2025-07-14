 class Outer{
     private val outerProperty="Outer property"
     private val innerobject="inner"
     class Nested{
         fun foo()="Nested function"
     }
     inner class Inner{
         fun foo()=innerobject
     }
 }
 fun main(){
     val nested=Outer.Nested()
     println(nested.foo())
     val inner=Outer().Inner().foo()
     println(inner)
     val outer=Outer()//通过外部类创建
     val inner1=outer.Inner().foo()
     println(inner)
 }
 //内部类只能通过外部类的实例来创建，不能像嵌套类一样通过外部类名来创建