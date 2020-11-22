package trycatch.Ex2;
import java.util.HashMap;

public class ListOfLogins {
    private static HashMap<Integer, Login> logins = new HashMap<>();
    private static int key = 0;

    public static boolean checkLogin(String username, String password){
        for (Login i : logins.values()) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean createNew(String username, String password){
        if (logins.size() != 0) {
            if (checkForDuplicates(username)) {
                return false;
            }
        }

        Login newLogin = new Login(username, password);
        logins.put(key, newLogin);
        key++;
        return true;
    }

    private static boolean checkForDuplicates(String username) {
        for (Login i : logins.values()) {
            if (i.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
