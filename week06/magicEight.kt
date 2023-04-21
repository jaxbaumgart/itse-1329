package week06

fun main() {
    while (true) {
        print("Ask me a question >> ")
        val question = readLine()!!.lowercase()
        if (question == "quit") {
            break
        }
        val responses = arrayOf(
            "Yes, of Course!", "Without a doubt, yes.", "You can count on it.", "For sure!", "Ask me later.",
            "I'm not sure.", "I can't tell you right now. I'll tell you after my nap. No way!", "I don't think so.",
            "Without a doubt, no.", "The answer is clearly NO."
        )
        val num = (1..9).random()
        println(responses[num])
    }
}