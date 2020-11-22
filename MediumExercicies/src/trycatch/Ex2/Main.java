package trycatch.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListOfFiles files = new ListOfFiles();
        Scanner scan = new Scanner(System.in);
        boolean token = false;
        int choice;

        do {
            System.out.println("*---------Menu---------*");
            System.out.println("* 1 - Create new file  *");
            System.out.println("* 2 - Get file         *");
            System.out.println("* 3 - Login            *");
            System.out.println("* 4 - Logout           *");
            System.out.println("* 5 - Signup           *");
            System.out.println("* 0 - Exit             *");
            System.out.println("*----------------------*");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    try {
                        if (token) {
                            System.out.println("Choose filename:");
                            scan.nextLine();
                            String filename = scan.nextLine();
                            files.createNew(filename);
                        } else {
                            throw new CustomException("LogIn necessary for creating a file.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Choose file:");
                        scan.nextLine();
                        String filename = scan.nextLine();
                        String file = files.checkForFile(filename);
                        System.out.println(file);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    if (loginCheck()) {
                        System.out.println("LogIn done with success.");
                        token = true;
                    } else {
                        System.out.println("Incorrect logIn");
                    }
                }

                case 4 -> token = false;

                case 5 -> {
                    if (signUp()) {
                        System.out.println("Sign up with success");
                    } else {
                        System.out.println("Duplicate entries");
                    }
                }
            }
        } while (choice != 0);
    }

    private static boolean signUp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        return ListOfLogins.createNew(username, password);
    }

    private static boolean loginCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        return ListOfLogins.checkLogin(username, password);
    }
}
