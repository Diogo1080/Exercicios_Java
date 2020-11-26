package trycatch.Ex2.CustomExeptions;

public class FileNotFoundException extends Exception {
    public FileNotFoundException() {
        super("There is no file with that name.");
    }
}
