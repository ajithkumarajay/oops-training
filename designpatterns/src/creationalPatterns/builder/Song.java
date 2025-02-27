package creationalPatterns.builder;

public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final double duration;
    private final int bpm;

    private Song(SongBuilder builder) {
        this.title = builder.getTitle();
        this.artist = builder.getArtist();
        this.genre = builder.getGenre();
        this.duration = builder.getDuration();
        this.bpm = builder.getBpm();
    }

    public void playSong() {
        System.out.println();
        System.out.println("Now Playing: " + title + " by " + artist);
        System.out.println("Genre: " + genre + ", Duration: " + duration + " mins, BPM: " + bpm);
        System.out.println();
    }

    public static Song createBuilder(SongBuilder builder) {
        return new Song(builder);
    }
}