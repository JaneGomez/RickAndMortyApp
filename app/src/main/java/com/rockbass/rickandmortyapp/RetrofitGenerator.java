package com.rockbass.rickandmortyapp;

import com.rockbass.rickandmortyapp.Character.Character;
import com.rockbass.rickandmortyapp.Location.Location;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitGenerator {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static Retrofit retrofitLocation = new Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
/*
    private static Retrofit retrofitEpisode = new Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();*/

    private static Character character;
    private static Location location;
  // private static Episode episode;

    public static Character getCharacterService(){
        if (character == null){
            character = retrofit.create(Character.class);
        }

        return character;
    }

    public static Location getLocationService(){
     if(location == null){
         location = retrofitLocation.create(Location.class);
     }
     return location;
    }
/*
    public static Episode getEpisodieService(){
        if(episode == null){
            episode = retrofitEpisode.create(Episode.class);
        }
        return episode;
    }*/

}
