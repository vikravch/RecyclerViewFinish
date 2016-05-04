package kistudio.com.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Android on 04.05.2016.
 */
public class MoviesAdapter extends RecyclerView.Adapter {

    private List<Movie> movieList;

    private class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView tvTitle;
        public TextView tvGenre;
        public TextView tvYear;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvGenre = (TextView) itemView.findViewById(R.id.tvGenre);
            tvYear = (TextView) itemView.findViewById(R.id.tvYear);

        }
    }

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.tvTitle.setText(movie.getmTitle());
        myViewHolder.tvYear.setText(movie.getmYear());
        myViewHolder.tvGenre.setText(movie.getmGenre());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
