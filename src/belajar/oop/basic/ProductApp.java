package belajar.oop.basic;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Macbook Pro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}
