fun main() {
    println("Did you call the victim? \n0 - No\n1 - Yes")
    val question1 = readLine()!!.toInt(2)
    println("Were you at the crime scene? \n0 - No\n1 - Yes")
    val question2 = readLine()!!.toInt(2)
    println("Do you live near the victim? \n0 - No\n1 - Yes")
    val question3 = readLine()!!.toInt(2)
    println("Did you owe it to the victim? \n0 - No\n1 - Yes")
    val question4 = readLine()!!.toInt(2)
    println("Have you ever worked with the victim? \n0 - No\n1 - Yes")
    val question5 = readLine()!!.toInt(2)

    val sumQuests = question1 + question2 + question3 + question4 + question5
    if (sumQuests == 2) {
        println("You are suspect!")
    } else if (sumQuests < 2) {
        println("You are innocent!")
    } else if (sumQuests <= 3) {
        println("You are accomplice!")
    } else if (sumQuests == 5) {
        println("Got you!, you are assassin!!!")
    }
}