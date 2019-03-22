package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class MovieSeries extends MediaUnit {
    private ArrayList<Movie> movies = new ArrayList();

    public MovieSeries() {
    }

    public MovieSeries(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }
}
