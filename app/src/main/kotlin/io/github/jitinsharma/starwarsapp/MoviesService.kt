package io.github.jitinsharma.starwarsapp

import io.github.jitinsharma.starwarsapp.activities.MovieObject
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

/**
 * Created by jitinsharma on 07/11/16.
 */
interface MoviesService {
    @GET("films")
    fun getMovies() : Call<ArrayList<MovieObject>>
}