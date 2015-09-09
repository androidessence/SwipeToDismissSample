package androidessence.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup RecyclerView
        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.movie_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        movieRecyclerView.setLayoutManager(linearLayoutManager);

        // Setup Adapter
        MovieAdapter movieAdapter = new MovieAdapter(this, getMovies());
        movieRecyclerView.setAdapter(movieAdapter);

        // Setup ItemTouchHelper
        ItemTouchHelper.Callback callback = new MovieTouchHelper(movieAdapter);
        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(movieRecyclerView);
    }

    private List<Movie> getMovies(){
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Harry Potter"));
        movieList.add(new Movie("Twilight"));
        movieList.add(new Movie("Star Wars"));
        movieList.add(new Movie("Star Trek"));
        movieList.add(new Movie("Galaxy Quest"));
        return movieList;
    }
}
