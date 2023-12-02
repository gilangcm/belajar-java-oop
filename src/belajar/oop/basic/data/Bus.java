package belajar.oop.basic.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
