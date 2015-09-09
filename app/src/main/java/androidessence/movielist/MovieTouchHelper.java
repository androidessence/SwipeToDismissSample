package androidessence.movielist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by adammcneilly on 9/8/15.
 */
public class MovieTouchHelper extends ItemTouchHelper.SimpleCallback {
    private MovieAdapter mMovieAdapter;

    public MovieTouchHelper(MovieAdapter movieAdapter){
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.mMovieAdapter = movieAdapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        mMovieAdapter.remove(viewHolder.getAdapterPosition());
    }
}
