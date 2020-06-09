package com.it.academy.homework.zoo;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;

    }

    protected abstract void makeSound();


}
