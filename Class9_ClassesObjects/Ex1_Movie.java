class Movie {
    // Attributes of the Movie class
    private String title;
    private String genre;
    private double rating;

    // Constructor to initialize the Movie object
    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // Method to display the movie details
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println();
    }
}

class MovieApp {
    public static void main(String[] args) {
        // Creating movie objects
        Movie movie1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie movie2 = new Movie("The Godfather", "Crime", 9.2);
        Movie movie3 = new Movie("Interstellar", "Adventure", 8.6);

        // Displaying movie details
        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
    }
}
