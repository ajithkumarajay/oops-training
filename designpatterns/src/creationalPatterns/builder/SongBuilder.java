package creationalPatterns.builder;

public class SongBuilder {
    private final String title;
    private final String artist;
    private String genre = "unknown";
    private double duration = 0.0;
    private int bpm = 128;

    public SongBuilder(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    //optional feilds
    public SongBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public SongBuilder setDuration(double duration) {
        this.duration = duration;
        return this;
    }

    public SongBuilder setBpm(int bpm) {
        this.bpm = bpm;
        return this;
    }

    public Song build() {
        return Song.createBuilder(this);
    }

    //getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }
    public double getDuration() { return duration; }
    public int getBpm() { return bpm; }
}