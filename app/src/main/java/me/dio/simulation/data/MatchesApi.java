package me.dio.simulation.data;

import java.util.List;

import me.dio.simulation.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;


public interface MatchesApi {
    @GET("matches.json")
    Call<List<Match>> getMatches();
}
