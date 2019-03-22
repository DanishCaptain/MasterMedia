package com.danishcaptain.mb.mastermedia.model.domain;

import java.util.Date;
import java.util.UUID;

public abstract class MediaUnit {
    private UUID id;
    private Date createTS;
    private Date updateTS;

    public MediaUnit() {
      this.id = UUID.randomUUID();
      createTS = new Date();
      updateTS = createTS;
    }

    public MediaUnit(UUID id, Date createTS, Date updateTS) {
        this.id = id;
        this.createTS = createTS;
        this.updateTS = updateTS;
    }
}
