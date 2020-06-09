package com.it.academy.homework.ex2Vector;

import java.util.Objects;

public class Vector {

    public static final Vector ZERO = new Vector(0, 0);

    private final Integer x;
    private final Integer y;

    public Vector(Integer x, Integer y) {
        this.x = x;
        this.y = y;

    }

    public static Vector sum(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vector subtract(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y);
    }

    public static int scalarProduct(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return x == vector.x &&
                y == vector.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
