package classes.Ex2;

public class Class {
    public Student[] students;
    public String year;
    public static String className = "Mindera School";

    public Class(Student[] students, String year) {
        this.students = students;
        this.year = year;
    }

    public void printClass() {
        System.out.println("id,classNumber,Name");
        for (int i = 0; i < this.students.length; i++) {
            System.out.print(this.students[i].id + " ");
            System.out.print(this.students[i].classNumber + " ");
            System.out.println(this.students[i].name);
        }
    }

    public void arrangeClassNumbers() {
        for (int i = 0; i < this.students.length; i++) {
            for (int j = i; j > 0 && (this.students[j - 1].name.compareTo(this.students[j].name) > 0); j--) {
                if (this.students[j - 1].name.equals(this.students[j].name)) break;

                Student temp = this.students[j];
                this.students[j] = this.students[j - 1];
                this.students[j - 1] = temp;
            }
        }

        for (int i = 0; i < this.students.length; i++) {

            this.students[i].classNumber = i;

        }
    }

    private Student[] addPlaceToArray(Student[] clubStudents) {
        Student[] tempStudents = new Student[clubStudents.length + 1];

        for (int i = 0; i < clubStudents.length; i++) {
            tempStudents[i] = clubStudents[i];
        }
        return tempStudents;
    }

    public Student[] getStudentsByClub(String choosenClub) {
        int j = 0;
        Student[] clubStudents = new Student[1];

        for (int i = 1; i < this.students.length; i++) {
            Student S = students[i];

            if (choosenClub.toLowerCase().equals(S.club.toLowerCase())) {
                if (j == clubStudents.length) {
                    clubStudents = addPlaceToArray(clubStudents);
                }

                clubStudents[j] = this.students[i];

                j++;
            }
        }
        return clubStudents;
    }

    public void removeStudentById(int id) {
        Student[] newClass = new Student[this.students.length - 1];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (id != students[i].id) {
                newClass[j] = students[i];
                j++;
            }
        }
        students = newClass;
    }
}
