package com.danishcaptain.mb.mastermedia.model;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import com.danishcaptain.mb.mastermedia.model.db.ModelDbHelper;
import com.danishcaptain.mb.mastermedia.model.domain.Movie;

import java.util.ArrayList;
import java.util.List;

public final class MediaModel {
    private ArrayList<Movie> movieL = new ArrayList();
    private static MediaModel singleton;
    private ModelDbHelper openHelper;

    private MediaModel() {
    }

    public void init(Context context) {
        openHelper = new ModelDbHelper(context);

        Movie m = new Movie();
        m.setTitle("300");
        m.setImdbId("tt0416449");
        m.setYear(2006);
        movieL.add(m);

        // Director Zack Snyder
    }

    public static MediaModel getInstance() {
        if (singleton == null) {
            singleton = new MediaModel();
        }
        return singleton;
    }

    public List<Movie> listAllMovies() {
        return movieL;
    }
}
