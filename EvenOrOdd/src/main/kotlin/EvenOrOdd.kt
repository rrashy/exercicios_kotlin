fun main() {
    print("Even or odd! Enter a number for me to verify: ")
    var number = readLine()!!.toInt()

    var parity = if (number % 2 == 0) {
        "even"
    } else {
        "odd"
    }
    print("$number this number is --> $parity \uD83D\uDE05")
}