package hackerrank

fun timeConversion(s: String): String {
    val updateHour = s.endsWith("PM")

    val timeExtract = s.take(8).split(":").toMutableList()
    if (!updateHour && timeExtract[0] == "12") {
        timeExtract[0] = "00"
    }
    if (updateHour && timeExtract[0] != "12") {
        timeExtract[0] = (timeExtract[0].toInt() + 12).toString()
    }
    return timeExtract.joinToString(":")
}

fun main() {
    println(timeConversion("01:20:01AM"))
}
