package exanimais;

import exanimais.animals.*;

public class AnimalFactory {
    public static Animals createAnimal(AnimalTypes animal) {
        switch (animal) {
            case RHINOCEROS -> {
                return new Rhinoceros();
            }
            case COCKROACH -> {
                return new Cockroach();
            }
            case BUFFALO -> {
                return new Buffalo();
            }
            case ELEPHANT -> {
                return new Elephant();
            }
            case LEOPARD ->{
                return new Leopard();
            }
            case LION -> {
                return new Lion();
            }
        }
        return null;
    }
}
