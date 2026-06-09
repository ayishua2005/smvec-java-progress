import java.util.*;

class Movie {
    String name;
    double rating;

    Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}

public class MovieRecommendation {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Movie A", 4.5));
        movies.add(new Movie("Movie B", 3.8));
        movies.add(new Movie("Movie C", 4.9));

        movies.sort((m1, m2) ->
                Double.compare(m2.rating, m1.rating));

        System.out.println("Recommended Movies:");

        for(Movie m : movies) {
            System.out.println(m.name + " Rating: " + m.rating);
        }
    }
}