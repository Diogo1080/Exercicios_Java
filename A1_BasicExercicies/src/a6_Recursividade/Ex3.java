package a6_Recursividade;

public class Ex3 {
    public static void main(String[] args) {
        String word = "Piuga  sasa";
        System.out.println(consuantes(word, word.length()));
    }

    public static int consuantes(String word, int size) {
        if (size == 0){
            return size;
        }

        char letter = word.charAt(size - 1);
        letter = Character.toLowerCase(letter);
        if (!(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter ==' '))
            return 1 + consuantes(word, size - 1);

        return consuantes(word, size - 1);
    }
}
