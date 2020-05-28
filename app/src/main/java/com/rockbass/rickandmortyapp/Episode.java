package com.rockbass.rickandmortyapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Episode {
    @GET
    Call<ResultEpisode> getEpisodes(@Url ArrayList<String> episode);
}
