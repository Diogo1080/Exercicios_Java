package trycatch.Ex2;


public class ListOfFiles {
    private String[] files = new String[10];
    private int pointer = 0;

    public boolean createNew(String filename) throws Exception {
        if (files[files.length - 1] != null) {
            throw new CustomException("File list is full.");
        }
        files[pointer] = filename;
        pointer++;
        return true;
    }

    public String checkForFile(String filename) throws Exception {
        if (files[0] == null) {
            throw new CustomException("No file was found.");
        }
        for (int i = 0; i < files.length; i++) {
            if (filename.equals(files[i])){
                return files[i];
            }
        }
        throw new CustomException("No file found with that name.");
    }
}
