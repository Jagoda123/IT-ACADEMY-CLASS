package com.it.academy.homework.ex4Palindrome;

import java.util.Scanner;

import static com.it.academy.homework.ex4Palindrome.Palindrom.palindrom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Napisz coś, a program sprawdzi czy to palindrom: ");
        String lancuch = scanner.nextLine();
        System.out.println("To " + (palindrom(lancuch) ? "jest" : " nie jest") + " palindrom");


    }
}
