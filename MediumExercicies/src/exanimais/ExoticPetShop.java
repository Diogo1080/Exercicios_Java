package exanimais;


public class ExoticPetShop {
    private final Animals[] animalList = new Animals[20];

    public ExoticPetShop() {
        for (int i = 0; i < animalList.length; i++) {
            animalList[i]= AnimalFactory.createAnimal(AnimalTypes.getRandomAnimalType());
        }
    }

    public void listAnimals() {
        for (Animals animals : animalList) {
            System.out.println(animals.adopted + "  " + animals.type);
        }
    }

    public int getAnimalCount() {
        return animalList.length;
    }

    public Animals getAnimal(int i) {
        return animalList[i];
    }

}
