package com.it.academy.homework.ex2Vector;

public class Main {
    public static void main(String[] args) {


        Vector v1 = new Vector(10, 5);
        Vector v2 = new Vector(-10, 2);
        Vector v3 = new Vector(2, 5);
        System.out.println("Sum: " + Vector.sum(v1, v2));
        System.out.println("Subtract: " + Vector.subtract(v1, v2));
        System.out.println("Scalar products: " + Vector.scalarProduct(v1, v2));
        System.out.println("Zero vector: " + Vector.ZERO);


    }
}
