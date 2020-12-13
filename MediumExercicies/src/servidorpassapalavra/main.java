package servidorpassapalavra;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            new Server().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
