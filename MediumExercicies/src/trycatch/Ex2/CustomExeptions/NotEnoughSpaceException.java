package trycatch.Ex2.CustomExeptions;

public class NotEnoughSpaceException extends Exception {
    public NotEnoughSpaceException() {
        super("there is no space.");
    }
}

