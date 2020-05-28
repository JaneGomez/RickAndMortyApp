package com.rockbass.rickandmortyapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultEpisode {
    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("air_date")
    @Expose
    public String air_date;

    @SerializedName("episode")
    @Expose
    public String episode;
}
