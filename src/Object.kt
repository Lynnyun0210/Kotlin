object AppLicationConfig{
    init {
        println("Config initialized")
    }
    const val VERSION="1.0"
    fun getDatabaseConfig():String="db_settings"
}

fun main(){
    println(AppLicationConfig.VERSION)
    println(AppLicationConfig.getDatabaseConfig())

    val config1=AppLicationConfig
    val config2=AppLicationConfig
    println(config1==config2)
}