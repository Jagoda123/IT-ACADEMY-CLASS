package com.it.academy.homework.shapes;

public class Main {

    public static void main(String[] args) {


        Koło k1 = new Koło(4);
        Koło k2 = new Koło(5);
        Rectangle r1 = new Rectangle(17, 14);
        Rectangle r2 = new Rectangle(20, 19);
        Square s1 = new Square(15);

        Shape[] shapes = {k1, k2, r1, r2, s1};
        Carpet c = new Carpet(shapes);
        c.getSize();


    }
}
