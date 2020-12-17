package trycatch.Ex2.CustomExeptions;

public class NotEnoughSpaceException extends FileManagerException {
    public NotEnoughSpaceException() {
        super("there is no space.");
    }
}

