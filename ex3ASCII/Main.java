package com.it.academy.homework.ex3ASCII;

public class Main {
    public static void main(String[] args) {


        {
            System.out.println("Wyświetlę znaki ASCII od 0 do 255");

            int a = 0;

            while (a <= 255) {
                System.out.println("Code: " + a + "  Character  " + (char) a);
                a++;
            }
        }
    }
}


