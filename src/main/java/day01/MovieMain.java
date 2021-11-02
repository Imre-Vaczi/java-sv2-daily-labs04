package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Pi", 1998);
        movie.addActor(new Actor("Sean", 1974));
        movie.addActor(new Actor("Mark", 1970));
        movie.addActor(new Actor("Ben", 1965));
        movie.addActor(new Actor("Samia", 1955));
        movie.addActor(new Actor("Ajay", 1990));

        System.out.println(movie.actorsInTheirTwenties());
    }
}
