package com.exaple;

import java.util.Scanner;

public class Div0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduca 2 numros enteros: ");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        DividePorCero(numero1,numero2);

    }

    public static void DividePorCero (int numero1, int numero2) throws ArithmeticException{

        try{
            int resultado = numero1 / numero2;
            System.out.println("El resutado es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

}

