package com.it.academy.homework.ex1Product;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(3, "baton", 30);
        Product p2 = new Product(3, "baton", 30);
        Product p3 = new Product(5, " napój Aloes", 10);
        Product p4 = new Product(8, "nutella", 35);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p1));
        System.out.println(p1 == p1);
        System.out.println(p1 == p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
