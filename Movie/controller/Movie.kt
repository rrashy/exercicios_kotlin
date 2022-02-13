package controller

import model.Movie
import model.MovieGender
import model.Rating

class Movie {
    fun movieFactory(
        tittle: String,
        gender: MovieGender,
        duration: Short,
        rating: Rating,
        preview: Boolean,
        director: String,
        screenWriter: String,
        casting: String
    ): Movie = model.Movie(
        tittle = tittle,
        gender = gender,
        duration = duration,
        rating = rating,
        preview = preview,
        director = director,
        screenWriter = screenWriter,
        casting = casting
    )
}