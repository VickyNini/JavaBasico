package com.exaple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        reverse(texto);
        System.out.println(" ");

    }

    public static void reverse(String texto) {
        StringBuilder reverse = new StringBuilder();
        int letras = texto.length();
        letras = letras - 1;

        for (int i = letras; i >= 0; i--) {
            reverse.append(texto.charAt(i));
        }
        System.out.println(reverse);

    }
}