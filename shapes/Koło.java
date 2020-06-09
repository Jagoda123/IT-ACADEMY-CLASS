package com.it.academy.homework.shapes;

public class Koło extends Shape {


    protected int radius;

    public Koło(int radius) {
        this.radius = radius;
    }


    @Override
    public void getArea() {
        System.out.println("rozmiar koła=" + radius);

    }
}
