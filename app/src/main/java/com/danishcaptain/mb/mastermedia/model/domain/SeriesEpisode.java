package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.Date;
import java.util.UUID;

public class SeriesEpisode extends MediaUnit {
    public SeriesEpisode() {
    }

    public SeriesEpisode(UUID id, Date createTS, Date updateTS) {
        super(id, createTS, updateTS);
    }
}
