package com.example.moviesaccess;

import com.google.gson.annotations.SerializedName;

public class MovieSpokenLanguage {
    @SerializedName("iso_639_1")
    private String iso6391;
    @SerializedName("name")
    private String name;

    public MovieSpokenLanguage(String iso6391, String name) {
        this.iso6391 = iso6391;
        this.name = name;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
