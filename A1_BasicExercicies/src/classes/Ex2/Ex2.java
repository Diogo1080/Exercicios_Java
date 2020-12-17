package classes.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Student[] Aulas = new Student[]{
                new Student(19, "Diogo", "Aveiro", "Null", 'M'),
                new Student(19, "Antonio", "Penafiel", "Porto", 'M'),
                new Student(19, "Antonio", "Matosinhos", "null", 'M'),
        };

        Class aClass = new Class(Aulas, "2020");

        aClass.printClass();
        System.out.println();

        aClass.arrangeClassNumbers();
        aClass.printClass();
        System.out.println();

        Student[] arrangedClass = aClass.getStudentsByClub("nUll");
        Class bClass = new Class(arrangedClass,"2020");
        bClass.printClass();
        System.out.println();

        aClass.removeStudentById(1);
        aClass.arrangeClassNumbers();
        aClass.printClass();
    }
}
