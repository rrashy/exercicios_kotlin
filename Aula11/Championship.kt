class Championship(
    private val name: String,
    private val year: Short
) {
    private var clubs = mutableListOf<Club>()

    fun registerNewClub(club: Club): Boolean = clubs.add(club)

    fun searchClubByName(name: String): Club? = clubs.firstOrNull { c -> c.name.equals(name,true) }

    fun editClub(newClub: Club): Boolean {
        val club = searchClubByName(newClub.name)
        if (club != null) {
            clubs[clubs.indexOf(club)] = newClub
            return true
        }
        return false
    }

    fun removeClub(name: String): Boolean = clubs.removeIf { c -> c.name.equals(name,true) }

    fun listAllTeams() = clubs

    fun listAllTeamsBySeries(series: Series) = clubs.filter { c -> c.series == series }
}