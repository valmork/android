package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=S582NST-8P3434Q-NRRMRVD-HZWGV2M&field=rating.kp&search=4-6&sortField=votes.kp&sortType=-1&limit=100")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{idFilms}?token=S582NST-8P3434Q-NRRMRVD-HZWGV2M")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);
}