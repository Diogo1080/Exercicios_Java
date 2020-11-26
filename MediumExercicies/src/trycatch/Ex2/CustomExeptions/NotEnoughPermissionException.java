package trycatch.Ex2.CustomExeptions;

public class NotEnoughPermissionException extends Exception {
    public NotEnoughPermissionException() {
        super("You dont have permission.");
    }
}
