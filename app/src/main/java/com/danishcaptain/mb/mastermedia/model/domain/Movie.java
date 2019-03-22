package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.Date;
import java.util.UUID;

public class Movie extends MediaUnit {
    private String title;
    private String imdbId;
    private int year;

    public Movie() {
    }

    public Movie(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
