object Settings {

    private val configurators = setOf("JsConfigurator", "PyConfigurator")

    fun setUp() {
        configurators.forEach {
            try {
                Class.forName(it)
                Class.forName(it)
            } catch (e: ClassNotFoundException) {
                println("Some configurations are ignored: ${e.message}")
            }
        }
    }
}