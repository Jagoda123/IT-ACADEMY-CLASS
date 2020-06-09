package com.it.academy.homework.ex4Palindrome;

public class Palindrom {

    public static boolean palindrom(String lancuch) {
        StringBuilder tekst = new StringBuilder(lancuch);
        return lancuch.equals(tekst.reverse().toString());


    }
}



