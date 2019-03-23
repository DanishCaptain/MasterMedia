package com.danishcaptain.mb.mastermedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.danishcaptain.mb.mastermedia.model.MediaModel;
import com.danishcaptain.mb.mastermedia.model.domain.Movie;

import java.util.List;

public class ListMoviesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_movies);

        List<Movie> x = MediaModel.getInstance().listAllMovies();
        System.out.println(x);
    }


}
