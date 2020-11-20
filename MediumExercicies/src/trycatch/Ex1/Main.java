package trycatch.Ex1;

public class Main {
    public static void main(String[] args) {
        try{
            readFile("batata.txt");
        } catch (Exception ex) {
            System.out.println("Error");
        } finally {
            System.out.println("Always runs!");
        }
    }
    private static void readFile(String filename) throws Exception{
        throw new CustomException(filename);
    }
}
