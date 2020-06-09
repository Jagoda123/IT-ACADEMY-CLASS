package com.it.academy.homework.zoo;

public class Main {

    public static void main(String args[]) {


        Lion l = new Lion("Krzyś");
        Elephant e = new Elephant("Lumpek");
        Rhino r = new Rhino("Zenek");

        Animal[] animals = {l, e, r};
        Zoo z = new Zoo(animals);
        z.enter();

    }


}
