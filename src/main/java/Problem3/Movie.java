package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.id = anotherMovie.id;
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie))
        {
            return false;
        }
        Movie movie = (Movie) obj;
        if(this.id == movie.id)
        {
            return true;
        }
        return false;
    }
}
