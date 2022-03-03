fun main() {
    print("Enter a year to find out if it is a leap year: ")
    val year = readLine()!!.toInt()

    if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
        print("$year IS a leap year!")
    }else{
        print("$year IS NOT a leap year!!")
    }
}