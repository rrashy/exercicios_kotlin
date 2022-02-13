package model

class Movie {
    var tittle: String
    var gender: MovieGender
    var duration: Float
    var rating: Rating
    var preview: Boolean
    var director: String
    var screenWriter: String
    var casting: String

    constructor(
        tittle: String,
        gender: MovieGender,
        duration: Short,
        rating: Rating,
        director: String,
        screenWriter: String,
        casting: String,
        preview: Boolean
    ){
        this.tittle = tittle
        this.gender = gender
        this.duration = duration.toFloat()
        this.rating = rating
        this.director = director
        this.screenWriter = screenWriter
        this.preview = preview
        this.casting = casting
    }
}
