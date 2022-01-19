package com.example.moviesaccess;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Cast {
    @SerializedName("id")
    private Integer id;
    @SerializedName("cast")
    private List<DetailCast> cast = null;

    public Cast(Integer id, List<DetailCast> cast) {
        this.id = id;
        this.cast = cast;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<DetailCast> getCast() {
        return cast;
    }

    public void setCast(List<DetailCast> cast) {
        this.cast = cast;
    }
}
