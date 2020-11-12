package exanimais;

public class Person {
    private String name;
    private AnimalTypes preference;
    private Animals adoptedAnimal;

    public Person(String name) {
        this.name = name;
        this.preference = AnimalTypes.getRandomAnimalType();
        this.adoptedAnimal = null;
    }

    public void adoptAnimal(Animals animal) {
        if (animal.getType() == preference) {
            this.adoptedAnimal = animal;
            animal.getAdopted();
            return;
        }
    }

    public AnimalTypes getPreference() {
        return preference;
    }

    public Animals getAdoptedAnimal() {
        if (adoptedAnimal==null){
            return null;
        }
        return adoptedAnimal;
    }
}
