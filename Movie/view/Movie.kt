package view
import model.Movie
import model.MovieGender
import model.Rating

fun main(){
    val movieController = controller.Movie()
    val movie = movieController.movieFactory(
    tittle = "Titanic",
    gender = MovieGender.DRAMA,
    duration = 120,
    rating = Rating.TEENAGE,
    preview = false,
    director = "James Cameron",
    screenWriter = "James Cameron",
    casting = "Leonardo DiCaprio, Kate Winslet, Gloria Stuart",
    )
    println(movie)
}