package trycatch.Ex2.CustomExeptions;

public class FileNotFoundException extends FileManagerException {
    public FileNotFoundException() {
        super("There is no file with that name.");
    }
}
