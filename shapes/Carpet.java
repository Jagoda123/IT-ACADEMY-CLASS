package com.it.academy.homework.shapes;

public class Carpet {

    private Shape[] shapes;


    public Carpet(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void getSize() {
        for (Shape shapes : shapes) {
            shapes.getArea();
        }
    }
}



