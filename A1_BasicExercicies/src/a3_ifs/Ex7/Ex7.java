package a3_ifs.Ex7;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(ReturnDay(1));
        System.out.println(Returnees(1));
    }

    public static String ReturnDay(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "friday";
            case 6:
                return "saturday";
            case 7:
                return "sunday";
            default:
                return "invalid";
        }
    }

    public static String Returnees(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            default:
                return "invalid";
        }
    }
}
