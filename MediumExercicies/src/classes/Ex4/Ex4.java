package classes.Ex4;

public class Ex4 {
    public static void main(String[] args) {

        ClassEx4 aClass = new ClassEx4(19, "Diogo", "Aveiro", "Null", 'M', "2020");
        aClass.addStudentToClass(19, "Antonio", "Penafiel", "Porto", 'M');
        aClass.addStudentToClass(19, "Antonio", "Matosinhos", "null", 'M');

        aClass.changeNameOfStudent(0,19,"Rui","Lisboa","Null",'M');

        aClass.printClass();
        System.out.println();

        aClass.arrangeClassNumbers();
        aClass.printClass();
        System.out.println();

        Student[] arrangedClass = aClass.getStudentsByClub("nUll");

        ClassEx4 bClass = new ClassEx4(
                arrangedClass[0].age,
                arrangedClass[0].name,
                arrangedClass[0].city,
                arrangedClass[0].club,
                arrangedClass[0].gender,
                "2020"
        );

        for (int i = 1; i < arrangedClass.length; i++) {
            bClass.addStudentToClass(
                    arrangedClass[i].age,
                    arrangedClass[i].name,
                    arrangedClass[i].city,
                    arrangedClass[i].club,
                    arrangedClass[i].gender
            );
        }

        bClass.printClass();
        System.out.println();

        aClass.removeStudentById(0);
        aClass.arrangeClassNumbers();
        aClass.printClass();

    }
}
