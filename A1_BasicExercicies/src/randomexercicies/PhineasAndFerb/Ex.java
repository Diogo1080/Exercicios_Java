package randomexercicies.PhineasAndFerb;

public class Ex {
    public static void main(String[] args) {
        lyrics song = new lyrics();

        //song.getLyrics();
        for (int i = 1; i < song.getLyricsLinesLength(); i++) {
            song.getLyricsOnLine(i);
        }
    }
}
