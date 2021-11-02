package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieMain {
    @Test
    void main(){
        Movie movie = new Movie("Pi", 1998);
        movie.addActor(new Actor("Sean", 1974));
        movie.addActor(new Actor("Mark", 1970));
        movie.addActor(new Actor("Ben", 1965));
        movie.addActor(new Actor("Samia", 1955));
        movie.addActor(new Actor("Ajay", 1990));

        assertEquals(2, movie.actorsInTheirTwenties());
    }
}
