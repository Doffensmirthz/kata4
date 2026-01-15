package software.ulpgc.kata3.application;

import software.ulpgc.kata3.io.RemoteMovieLoader;
import software.ulpgc.kata3.model.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RemoteMovieLoader remoteMovieLoader = new RemoteMovieLoader();
        List<Movie> movies = remoteMovieLoader.loadAll();
        movies.forEach(System.out::println);
    }
}
