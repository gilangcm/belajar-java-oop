package belajar.oop.basic.data;

public class Avanza implements Car, IsMaintenance{
    @Override
    public void drive() {
        System.out.println("avanza drive");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "TOYOTA";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }

}
