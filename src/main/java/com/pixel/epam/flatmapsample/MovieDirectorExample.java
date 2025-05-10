package com.pixel.epam.flatmapsample;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MovieDirectorExample {
    public static void main(String[] args) {
        /*
        * Q. Given a list of Movie objects where each Movie has a list of Director objects,
        * how can I use Java Streams to extract director names that start with 'C' and
        * count their occurrences grouped by name?
        *
        * Q. How to count and group director names starting with 'C' using Java Streams ?
        * */
        List<Movie> movies = MoviesData.getMovies();
        Map<String, Long> namesStartWithC = movies.stream()
                .flatMap(movie -> movie.getDirectors().stream())
                .map(Director::getName)
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesStartWithC);
    }
}
