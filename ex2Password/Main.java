package com.it.academy.homework.ex2Password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz hasło");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}$");
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.matches() ? "good password" : "bad password");


    }
}

