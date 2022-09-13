object JsConfigurator {
    init {
        Assistant.implementations.add(JsAssistant)
    }
}

object JsAssistant : Assistant() {
    override fun run() {
        println("Java Script assistant")
    }
}