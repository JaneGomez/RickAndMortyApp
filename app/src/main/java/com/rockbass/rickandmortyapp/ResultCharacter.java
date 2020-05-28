package com.rockbass.rickandmortyapp;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ResultCharacter {
    static class Info {
        public int count;
        public int pages;
        public String next;
        public String prev;
    }

    public Info info;

    static class Result {
        public int id;
        public String name;
        public String status;
        public String species;
        public String type;
        public String gender;
        public String image;
        public String url;
        public Location location;
        public List<String> episode;
    }

    public List<Result> results;

    static class Location{

        public String name;
        public String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        @NonNull
        @Override
        public String toString() {
            return super.toString();
        }
    }

}
