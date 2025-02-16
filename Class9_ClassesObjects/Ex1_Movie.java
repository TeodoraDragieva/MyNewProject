class Movie {
    private String title;
    private String genre;
    private double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println();
    }
}

class MovieApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie movie2 = new Movie("The Godfather", "Crime", 9.2);
        Movie movie3 = new Movie("Interstellar", "Adventure", 8.6);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
    }
}
