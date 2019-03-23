package com.danishcaptain.mb.mastermedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

//        if (id == R.id.action_refresh) {
//            return true;
//        }
        switch (item.getItemId()) {
            case R.id.action_refresh:
                startActivity(new Intent(this, ListMoviesActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
