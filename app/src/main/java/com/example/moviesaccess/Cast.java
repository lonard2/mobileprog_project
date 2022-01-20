package com.example.moviesaccess;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Cast {
    @SerializedName("id")
    private Integer id;
    @SerializedName("cast")
    private List<DetailCast> cast;

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

    public class DetailCast {
        @SerializedName("adult")
        private Boolean adult;
        @SerializedName("gender")
        private Integer gender;
        @SerializedName("id")
        private Integer id;
        @SerializedName("known_for_department")
        private String knownForDepartment;
        @SerializedName("name")
        private String name;
        @SerializedName("original_name")
        private String originalName;
        @SerializedName("popularity")
        private Double popularity;
        @SerializedName("profile_path")
        private String profilePath;
        @SerializedName("cast_id")
        private Integer castId;
        @SerializedName("character")
        private String character;
        @SerializedName("credit_id")
        private String creditId;
        @SerializedName("order")
        private Integer order;

        public DetailCast(Boolean adult, Integer gender, Integer id, String knownForDepartment,
                          String name, String originalName, Double popularity, String profilePath,
                          Integer castId, String character, String creditId, Integer order) {
            this.adult = adult;
            this.gender = gender;
            this.id = id;
            this.knownForDepartment = knownForDepartment;
            this.name = name;
            this.originalName = originalName;
            this.popularity = popularity;
            this.profilePath = profilePath;
            this.castId = castId;
            this.character = character;
            this.creditId = creditId;
            this.order = order;
        }

        public Boolean getAdult() {
            return adult;
        }

        public void setAdult(Boolean adult) {
            this.adult = adult;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getKnownForDepartment() {
            return knownForDepartment;
        }

        public void setKnownForDepartment(String knownForDepartment) {
            this.knownForDepartment = knownForDepartment;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public Double getPopularity() {
            return popularity;
        }

        public void setPopularity(Double popularity) {
            this.popularity = popularity;
        }

        public String getProfilePath() {
            return profilePath;
        }

        public void setProfilePath(String profilePath) {
            this.profilePath = profilePath;
        }

        public Integer getCastId() {
            return castId;
        }

        public void setCastId(Integer castId) {
            this.castId = castId;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        public String getCreditId() {
            return creditId;
        }

        public void setCreditId(String creditId) {
            this.creditId = creditId;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

    }
}
