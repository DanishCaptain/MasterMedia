package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class SeriesYear extends MediaUnit {
    private ArrayList<SeriesEpisode> episodes = new ArrayList();

    public SeriesYear() {
    }

    public SeriesYear(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }
}
