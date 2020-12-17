package trycatch.Ex2.CustomExeptions;

public class FileManagerException extends Exception {
    FileManagerException(String msg){
        super(msg);
    }
}
