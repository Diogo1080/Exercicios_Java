package trycatch.Ex2;

import trycatch.Ex2.CustomExeptions.*;


public class Main {
    public static void main(String[] args) throws Exception {
        FileManager files = new FileManager();

        try {
            files.createNew("Diogo");
        } catch (FileManagerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            files.Login();
            for (int i = 0; i < 12; i++) {
                files.createNew("Diogo " + i);
            }
        } catch (FileManagerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String file = files.checkForFile("Piu");
            System.out.println(file);
        } catch (FileManagerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String file = files.checkForFile("Diogo 1");
            System.out.println(file);
        } catch (FileManagerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
