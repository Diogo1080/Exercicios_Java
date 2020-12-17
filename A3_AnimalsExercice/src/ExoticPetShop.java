import animals.AnimalTypes;
import animals.Animals;

public class ExoticPetShop {
    private final Animals[] animalList = new Animals[20];

    public ExoticPetShop() {
        for (int i = 0; i < animalList.length; i++) {
            animalList[i]= AnimalFactory.createAnimal(AnimalTypes.getRandomAnimalType());
        }
    }

    public void listAnimals() {
        for (Animals animals : animalList) {
            System.out.println(animals.isAdopted() + "  " + animals.getType());
        }
    }

    public int getAnimalCount() {
        return animalList.length;
    }

    public Animals getAnimal(int i) {
        return animalList[i];
    }

}
