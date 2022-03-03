fun main() {
    print("Enter a first side: ")
    val side1 = readLine()!!.toFloat()
    print("Enter a second side: ")
    val side2 = readLine()!!.toFloat()
    print("Enter a third side: ")
    val side3 = readLine()!!.toFloat()

    if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
         print("Is not a triangle!")
    else if (side1 == side2 && side1 == side3)
         print("It's a equilateral triangle!")
    else if (side1 == side2 || side1 == side3 || side2 == side3)
         print("It's a isosceles triangle!")
    else print("It's a scalene triangle!")
}