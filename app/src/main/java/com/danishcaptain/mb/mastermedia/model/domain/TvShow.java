package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class TvShow extends MediaUnit {
    private ArrayList<SeriesYear> years = new ArrayList<>();

    public TvShow() {
    }

    public TvShow(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }

}
