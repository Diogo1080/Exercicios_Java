package trycatch.Ex2.CustomExeptions;

public class NotEnoughPermissionException extends FileManagerException {
    public NotEnoughPermissionException() {
        super("You dont have permission.");
    }
}
