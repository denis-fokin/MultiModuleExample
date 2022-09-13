fun main() {
    Settings.setUp()
    Assistant.implementations.forEach { it.run() }
}