fun main() {
    val brasileirao = Championship(name = "Brasileirão", 2022)

    // gremio
    if (
        brasileirao.registerNewClub(
            Club(
                name = "Grêmio",
                series = Series.B,
                foundedIn = 1903
            )
        )
    ) println("Club has been registered successfully")
    else println("Unable to register club!!")
    // inter
    if (
        brasileirao.registerNewClub(
            Club(
                name = "Inter",
                series = Series.A,
                foundedIn = 1909
            )
        )
    ) println("Club has been registered successfully")
    else println("Unable to register club!!")
    // flamengo
    if (
        brasileirao.registerNewClub(
            Club(
                name = "Flamengo",
                series = Series.A,
                foundedIn = 1895
            )
        )
    ) println("Club has been registered successfully")
    else println("Unable to register club!!")

    // corinthias
    if (
        brasileirao.registerNewClub(
            Club(
                name = "Corinthias",
                series = Series.A,
                foundedIn = 1901
            )
        )
    ) println("Club has been registered successfully")
    else println("Unable to register club!!")

    //list clubs
    val clubs = brasileirao.listAllTeams()
    val clubNumbers = clubs.size - 1

    for (index in 0..clubNumbers) {
        println("Club name: ${clubs[index].name}\nSeries: ${clubs[index].series}\nFounded in: ${clubs[index].foundedIn}")
    }
}