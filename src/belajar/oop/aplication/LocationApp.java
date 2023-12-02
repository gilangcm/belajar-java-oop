package belajar.oop.aplication;

import belajar.oop.basic.City;
import belajar.oop.basic.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location();  // ini adalah error
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
