package com.ajdi.yassin.popularmovies.data;

import com.ajdi.yassin.popularmovies.data.local.model.Movie;
import com.ajdi.yassin.popularmovies.data.local.model.RepoMoviesResult;
import com.ajdi.yassin.popularmovies.ui.movieslist.MoviesFilterType;

import java.util.List;

import androidx.lifecycle.LiveData;

/**
 * @author Yassin Ajdi.
 */
public interface DataSource {

//    RepoMovieDetailsResult loadMovie(long movieId);

    RepoMoviesResult loadMoviesFilteredBy(MoviesFilterType sortBy);

    LiveData<List<Movie>> getAllFavoriteMovies();

    void favoriteMovie(Movie movie);

    void unfavoriteMovie(Movie movie);
}
