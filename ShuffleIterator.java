import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleIterator implements Iterator {
    private List<Song> songs;
    private List<Integer> shuffledIndices;
    private int position = 0;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        shuffledIndices = new ArrayList<>();
        for (int i = 0; i < songs.size(); i++) {
            shuffledIndices.add(i);
        }
        Random random = new Random();
        for (int i = 0; i < shuffledIndices.size(); i++) {
            int j = random.nextInt(shuffledIndices.size());
            int temp = shuffledIndices.get(i);
            shuffledIndices.set(i, shuffledIndices.get(j));
            shuffledIndices.set(j, temp);
        }
    }

    @Override
    public boolean hasNext() {
        return position < shuffledIndices.size();
    }

    @Override
    public Song next() {
        return songs.get(shuffledIndices.get(position++));
    }
}
