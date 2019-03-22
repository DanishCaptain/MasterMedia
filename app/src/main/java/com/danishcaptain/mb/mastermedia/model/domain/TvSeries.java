package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class TvSeries extends MediaUnit {
    private ArrayList<SeriesYear> years = new ArrayList();

    public TvSeries() {
    }

    public TvSeries(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }
}
