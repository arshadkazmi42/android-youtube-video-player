package com.arshad.letsmath;

/**
 * Created by root on 19/2/17.
 */
public class Movies {

    String name;
    String image;
    String trailer;
    String cast;
    String description;

    public Movies() {}

    public Movies(String name, String image, String trailer, String cast, String description) {
        this.name = name;
        this.image = image;
        this.trailer = trailer;
        this.cast = cast;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCast() {
        return cast;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
