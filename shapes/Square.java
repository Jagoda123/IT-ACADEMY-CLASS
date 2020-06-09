package com.it.academy.homework.shapes;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public void getArea() {
        System.out.println("rozmiar kwadratu=" + size);
    }

}
