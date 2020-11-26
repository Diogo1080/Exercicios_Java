package trycatch.Ex2;


import trycatch.Ex2.CustomExeptions.*;

public class FileManager {
    private String[] files = new String[10];
    private int pointer = 0;

    public boolean createNew(String filename) throws Exception {
        if (files[files.length - 1] != null) {
            throw new NotEnoughSpaceException();
        }
        files[pointer] = filename;
        pointer++;
        return true;
    }

    public String checkForFile(String filename) throws Exception {
        if (files[0] == null) {
            throw new FileNotFoundException();
        }
        for (String file : files) {
            if (filename.equals(file)) {
                return file;
            }
        }
        throw new FileNotFoundException();
    }
}
