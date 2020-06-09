package com.it.academy.homework.ex1Words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź zdanie, które chcesz podzielić na słowa");
        String line = scanner.nextLine();
        System.out.println(line.replaceAll(" ", ","));

// problem pojawia się gdy użyjemy w zdaniu przecinka - program wstawi kolejny
    }
}
