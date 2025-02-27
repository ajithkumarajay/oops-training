package creationalPatterns.builder;

public class builderMethod {
    public static void main(String[] args) {
        Song mysong = new SongBuilder("Reflect", "ajkay")
                .setDuration(2.28)
                .build();

                Song mySong2 = new SongBuilder("Nightlight", "Illenium")
                .setDuration(3.12)
                .setBpm(150)
                .setGenre("Melodic Dubstep")
                .build();
                
        mysong.playSong();
        mySong2.playSong();
    }
}