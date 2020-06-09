package com.it.academy.homework.book;

public class Author {
    private String name = "Agnieszka Włoszczyk";
    private String email = "agnieszka@gmail.com";
    private char gender = 'f';


    public void displayAuthor() {

        System.out.println("Autorem jest:" + name);
        System.out.println("Kontakt :" + email);
        System.out.println("płeć:" + gender);

    }
}