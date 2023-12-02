package belajar.oop.aplication;

import belajar.oop.basic.data.Animal;
import belajar.oop.basic.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();
    }
}
