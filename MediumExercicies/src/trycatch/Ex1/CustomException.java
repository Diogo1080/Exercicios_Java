package trycatch.Ex1;

public class CustomException extends Exception {
    public CustomException() {
        super("This is a custim exeption");
    }

    public CustomException(String file) {
        super("This file was not found " + file);
    }
}
