package com.example.movieappmad23.screens

const val DETAIL_ARGUMENT_KEY = "movieId"
sealed class Screen (val route: String) {
    object MainScreen : Screen("main")
    object DetailScreen : Screen("detail/{$DETAIL_ARGUMENT_KEY}") {
        fun withId(id: String): String {
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id)
        }
    }

    object AddMovieScreen : Screen("addMovie")

    // object AddMovieButton : Screen("Add") Tried to add new functionality

    object FavoriteScreen : Screen("favorite")

}