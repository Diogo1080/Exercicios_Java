package classes.Ex4;

public class ClassEx4 {
    private Student[] alunos = new Student[1];
    public String year;
    public static String className = "Mindera School";


    public ClassEx4(int age, String name, String city, String club, char gender, String year) {
        alunos[0] = new Student(age, name, city, club, gender);
        this.year = year;
    }

    public void addStudentToClass(int age, String name, String city, String club, char gender) {
        Student[] newAlunos = new Student[alunos.length + 1];

        for (int i = 0; i < alunos.length; i++) {
            newAlunos[i] = alunos[i];
        }

        newAlunos[newAlunos.length - 1] = new Student(age, name, city, club, gender);
        alunos = newAlunos;
    }

    public void printClass() {
        System.out.println("----------");
        System.out.println("id,CN,Name");

        for (int i = 0; i < this.alunos.length; i++) {
            System.out.print(this.alunos[i].id + "  ");
            System.out.print(this.alunos[i].classNumber + "  ");
            System.out.println(this.alunos[i].name);
        }

    }

    public void arrangeClassNumbers() {
        for (int i = 0; i < this.alunos.length; i++) {
            for (int j = i; j > 0 && (this.alunos[j - 1].name.compareTo(this.alunos[j].name) > 0); j--) {
                if (this.alunos[j - 1].name.equals(this.alunos[j].name)) break;

                Student temp = this.alunos[j];
                this.alunos[j] = this.alunos[j - 1];
                this.alunos[j - 1] = temp;
            }
        }

        for (int i = 0; i < this.alunos.length; i++) {

            this.alunos[i].classNumber = i;

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

        for (int i = 1; i < this.alunos.length; i++) {
            Student S = alunos[i];

            if (choosenClub.toLowerCase().equals(S.club.toLowerCase())) {
                if (j == clubStudents.length) {
                    clubStudents = addPlaceToArray(clubStudents);
                }

                clubStudents[j] = this.alunos[i];

                j++;
            }
        }
        return clubStudents;
    }

    public void removeStudentById(int id) {
        Student[] newClass = new Student[this.alunos.length - 1];
        int j = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (id != alunos[i].id) {
                newClass[j] = alunos[i];
                j++;
            }
        }
        alunos = newClass;
    }

    public void changeNameOfStudent(int id,int age, String name, String city, String club, char gender) {
        alunos[id].name = name;
        alunos[id].age = age;
        alunos[id].city = city;
        alunos[id].club = club;
        alunos[id].gender = gender;
    }
}
