object PyConfigurator {
    init {
        Assistant.implementations.add(PyAssistant)
    }
}

object PyAssistant : Assistant() {
    override fun run() {
        println("Python assistant")
    }
}