package com.pixel.epam.flatmapsample;

import java.util.List;

public class MoviesData {
    public static List<Movie> getMovies() {
        return List.of(
                new Movie(1, "Inception", List.of(new Director(1, "Christopher Nolan"))),
                new Movie(2, "The Dark Knight", List.of(new Director(1, "Christopher Nolan"))),
                new Movie(3, "Pulp Fiction", List.of(new Director(2, "Quentin Tarantino"))),
                new Movie(4, "Avengers: Endgame", List.of(new Director(3, "Anthony Russo"), new Director(4, "Joe Russo"))),
                new Movie(5, "The Matrix", List.of(new Director(5, "Lana Wachowski"), new Director(6, "Lilly Wachowski"))),
                new Movie(6, "Fight Club", List.of(new Director(7, "David Fincher"))),
                new Movie(7, "Interstellar", List.of(new Director(1, "Christopher Nolan"))),
                new Movie(8, "The Shawshank Redemption", List.of(new Director(8, "Frank Darabont"))),
                new Movie(9, "The Godfather", List.of(new Director(9, "Francis Ford Coppola"))),
                new Movie(10, "Goodfellas", List.of(new Director(10, "Martin Scorsese"))),
                new Movie(11, "The Grand Budapest Hotel", List.of(new Director(11, "Wes Anderson"))),
                new Movie(12, "Parasite", List.of(new Director(12, "Bong Joon-ho"))),
                new Movie(13, "Gladiator", List.of(new Director(13, "Ridley Scott"))),
                new Movie(14, "Jurassic Park", List.of(new Director(14, "Steven Spielberg"))),
                new Movie(15, "Titanic", List.of(new Director(15, "James Cameron"))),
                new Movie(16, "The Social Network", List.of(new Director(7, "David Fincher"))),
                new Movie(17, "Kill Bill", List.of(new Director(2, "Quentin Tarantino"))),
                new Movie(18, "The Irishman", List.of(new Director(10, "Martin Scorsese"))),
                new Movie(19, "Mad Max: Fury Road", List.of(new Director(16, "George Miller"))),
                new Movie(20, "The Lord of the Rings: The Fellowship of the Ring", List.of(new Director(17, "Peter Jackson"))),
                new Movie(21, "The Silence of the Lambs", List.of(new Director(18, "Jonathan Demme"))),
                new Movie(22, "Schindler's List", List.of(new Director(14, "Steven Spielberg"))),
                new Movie(23, "Django Unchained", List.of(new Director(2, "Quentin Tarantino"))),
                new Movie(24, "Alien", List.of(new Director(13, "Ridley Scott"))),
                new Movie(25, "Avatar", List.of(new Director(15, "James Cameron"))),
                new Movie(26, "Black Panther", List.of(new Director(19, "Ryan Coogler"))),
                new Movie(27, "Whiplash", List.of(new Director(20, "Damien Chazelle"))),
                new Movie(28, "The Dark Knight Rises", List.of(new Director(1, "Christopher Nolan"))),
                new Movie(29, "The Big Lebowski", List.of(new Director(21, "Joel Coen"))),
                new Movie(30, "Fargo", List.of(new Director(21, "Joel Coen"), new Director(22, "Ethan Coen")))
        );
    }
}
