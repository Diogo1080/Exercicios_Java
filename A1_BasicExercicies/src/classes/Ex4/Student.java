package classes.Ex4;

public class Student {
    public int id;
    public int age;
    public int classNumber;
    public String city;
    public String name;
    public String club;
    public char gender;
    private static int amount = 0;

    public Student(int age, String name, String city, String club, char gender) {
        this.age = age;
        this.name = name;
        this.city = city;
        this.club = club;
        this.gender = Character.toUpperCase(gender);
        this.id = setId();
    }

    private static int setId() {
        return amount++;
    }

}
