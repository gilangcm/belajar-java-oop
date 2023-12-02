package belajar.oop.advance;

import belajar.oop.basic.Product;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Asus ROG", 25000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }

}
