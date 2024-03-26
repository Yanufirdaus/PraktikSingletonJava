import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class MovieDatabase {
    private static MovieDatabase instance;

    private Map<String, String> movieGenres;

    private MovieDatabase() {
        movieGenres = new HashMap<>();
        movieGenres.put("Interstellar", "Sci-Fi");
        movieGenres.put("The Godfather", "Crime");
        movieGenres.put("Inception", "Sci-Fi");
        movieGenres.put("The Shawshank Redemption", "Drama");
        movieGenres.put("Avatar", "Science Fiction");
        movieGenres.put("The Matrix", "Science Fiction");
        movieGenres.put("Titanic", "Romance");
        movieGenres.put("The Lion King", "Animation");
        movieGenres.put("Forrest Gump", "Drama");
        movieGenres.put("Jurassic Park", "Adventure");
        movieGenres.put("The Dark Knight", "Action");
        movieGenres.put("Pulp Fiction", "Crime");
        movieGenres.put("Gladiator", "Action");
        movieGenres.put("Saving Private Ryan", "War");
        movieGenres.put("The Avengers", "Action");
        movieGenres.put("The Silence of the Lambs", "Thriller");
        movieGenres.put("The Green Mile", "Drama");
        movieGenres.put("Fight Club", "Drama");
        movieGenres.put("Schindler's List", "Biography");
        movieGenres.put("The Prestige", "Mystery");
        movieGenres.put("Goodfellas", "Crime");
        movieGenres.put("The Departed", "Crime");
        movieGenres.put("Inglourious Basterds", "War");
        movieGenres.put("Back to the Future", "Adventure");
        movieGenres.put("The Terminator", "Science Fiction");
        movieGenres.put("Indiana Jones and the Raiders of the Lost Ark", "Adventure");
        movieGenres.put("The Sixth Sense", "Mystery");
        movieGenres.put("The Usual Suspects", "Crime");
        movieGenres.put("The Shining", "Horror");
        movieGenres.put("Seven", "Mystery");
        movieGenres.put("Forrest Gump", "Drama");
        movieGenres.put("The Lion King", "Animation");
        movieGenres.put("Jaws", "Thriller");
        movieGenres.put("Toy Story", "Animation");
        movieGenres.put("The Godfather Part II", "Crime");
        movieGenres.put("Shrek", "Animation");
        movieGenres.put("Die Hard", "Action");
        movieGenres.put("The Sound of Music", "Musical");
        movieGenres.put("Finding Nemo", "Animation");
        movieGenres.put("The Wizard of Oz", "Adventure");
        movieGenres.put("Ghostbusters", "Comedy");
        movieGenres.put("The Exorcist", "Horror");
        movieGenres.put("Toy Story 2", "Animation");
        movieGenres.put("Braveheart", "Biography");
        movieGenres.put("Casablanca", "Drama");
        movieGenres.put("The Great Escape", "Adventure");
        movieGenres.put("Raiders of the Lost Ark", "Action");
        movieGenres.put("Blade Runner", "Sci-Fi");
        movieGenres.put("The Princess Bride", "Adventure");
        movieGenres.put("Rocky", "Drama");
        movieGenres.put("A Clockwork Orange", "Crime");
        movieGenres.put("Groundhog Day", "Comedy");
    }

    public static MovieDatabase getInstance() {
        if (instance == null) {
            instance = new MovieDatabase();
        }
        return instance;
    }

    public String getGenre(String movieTitle) {
        return movieGenres.get(movieTitle);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MovieDatabase movieDatabase = MovieDatabase.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String movieTitle = scanner.nextLine();

        String genre = movieDatabase.getGenre(movieTitle);

        if (genre != null) {
            System.out.println("Genre dari film \"" + movieTitle + "\" adalah " + genre);
        } else {
            System.out.println("Film \"" + movieTitle + "\" tidak ditemukan dalam database.");
        }
    }
}