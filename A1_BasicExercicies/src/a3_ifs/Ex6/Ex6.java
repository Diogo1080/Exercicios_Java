package a3_ifs.Ex6;

public class Ex6 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 41) {
            System.out.println(fizzbuzz(i));
            i++;
        }

    }

    public static String fizzbuzz(int number) {
        String str = "";
        if (number % 3 == 0) {
            str = str + "fizz";
        }
        if (number % 5 == 0) {
            str = str + "buzz";
        }
        if (number % 3 != 0 && number % 5 != 0) {
            str = String.valueOf(number);
        }
        return str;
    }
}
