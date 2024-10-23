import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Song {
    private String title;
    private String genre;

    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}

