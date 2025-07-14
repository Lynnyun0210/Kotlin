import jdk.jfr.DataAmount

//密封接口：定义支付能力

sealed interface PaymentMethod{
    val amount: Double
    fun process()
}
//seal class

sealed class PaymentPlatform{
    data class Online(val apiKey:String):PaymentPlatform()
    object Offline:PaymentPlatform()
}
data class CreditCard(
    override val amount: Double,
    val cardNumber: String,
    val platform: PaymentPlatform.Online
):PaymentMethod{
    override fun process() {
        println("Processing $amount via Credit Card")
    }
}
data class MobilePay(
    override val amount: Double,
    val phoneNumber:String
):PaymentMethod{
    override fun process() = println("Processing $amount via MobilePay")
}
// 使用
fun handlePayment(method: PaymentMethod) {
    when (method) {
        is CreditCard -> {
            method.process()
            println("Using API key: ${method.platform.apiKey}")
        }
        is MobilePay -> method.process()
    }
}

fun main() {
    val payment = CreditCard(
        amount = 100.0,
        cardNumber = "4111-1111-1111-1111",
        platform = PaymentPlatform.Online("key_123")
    )
    handlePayment(payment)
}