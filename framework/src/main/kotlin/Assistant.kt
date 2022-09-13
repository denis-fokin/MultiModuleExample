abstract class Assistant {
    companion object {
        val implementations: MutableSet<Assistant> = mutableSetOf()
    }

    abstract fun run()
}