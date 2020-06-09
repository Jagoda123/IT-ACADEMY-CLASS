package com.it.academy.homework.shapes;

public class Rectangle extends Shape {


    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void getArea() {
        System.out.println("rozmiar prostokąta=" + height + "x" + weight);
    }


}
