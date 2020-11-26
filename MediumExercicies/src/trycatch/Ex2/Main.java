package trycatch.Ex2;

import trycatch.Ex2.CustomExeptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileManager files = new FileManager();
        Scanner scan = new Scanner(System.in);
        boolean login = false;
        int choice;

        do {
            System.out.println("*---------Menu---------*");
            System.out.println("* 1 - Create new file  *");
            System.out.println("* 2 - Get file         *");
            System.out.println("* 3 - Login            *");
            System.out.println("* 4 - Logout           *");
            System.out.println("* 0 - Exit             *");
            System.out.println("*----------------------*");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    try {
                        if (login) {
                            System.out.println("Choose filename:");
                            scan.nextLine();
                            String filename = scan.nextLine();
                            files.createNew(filename);
                        } else {
                            throw new NotEnoughPermissionException();
                        }
                    } catch (NotEnoughPermissionException ex) {
                        System.out.println(ex.getMessage());

                    } catch (NotEnoughSpaceException ex) {
                        System.out.println(ex.getMessage());

                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());

                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Choose file:");
                        scan.nextLine();
                        String filename = scan.nextLine();
                        String file = files.checkForFile(filename);
                        System.out.println(file);
                    } catch (NotEnoughSpaceException ex) {
                        System.out.println(ex.getMessage());

                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());

                    }
                }
                case 3 -> login = true;

                case 4 -> login = false;
            }
        } while (choice != 0);
    }
}
