package com.example.moviesaccess;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CastId {
    @SerializedName("id")
    private Integer id;

    @SerializedName("cast")
    private List<Cast> cast = null;

    public CastId(Integer id, List<Cast> cast) {
        this.id = id;
        this.cast = cast;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }
}
