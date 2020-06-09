package com.it.academy.homework.zoo;

public class Zoo {

    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void enter() {
        for (Animal animal : animals) {
            animal.makeSound();
        }


    }
}


