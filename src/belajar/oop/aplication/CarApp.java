package belajar.oop.aplication;

import belajar.oop.basic.data.Avanza;
import belajar.oop.basic.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

    }
}
