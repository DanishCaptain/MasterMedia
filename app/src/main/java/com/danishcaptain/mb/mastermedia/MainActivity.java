package com.danishcaptain.mb.mastermedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.danishcaptain.mb.mastermedia.model.MediaModel;
import com.danishcaptain.mb.mastermedia.model.domain.Movie;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaModel.getInstance().init(this);

        List<Movie> x = MediaModel.getInstance().listAllMovies();
        System.out.println(x);
    }
}
