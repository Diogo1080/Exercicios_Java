package exanimais;

public class Main {
    public static void main(String[] args) {
        ExoticPetShop shop = new ExoticPetShop();
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("Name" + i);
        }

        for (Person person : people) {
            for (int j = 0; j < shop.getAnimalCount(); j++) {
                if (!shop.getAnimal(j).adopted) {
                    person.adoptAnimal(shop.getAnimal(j));
                }
            }
        }

        for (Person person : people) {
            System.out.print(person.getPreference() + "  ");
            if (person.getAdoptedAnimal()!=null){
                System.out.println(person.getAdoptedAnimal().getSound());
            }else{
                System.out.println("null");
            }
        }
    }
}
