package com.example;

public class funcion {

    public static void main(String[] args){

        double resultado1 = precioFinal(150);
        double resultado2 = precioFinal(262);
        double resultado3 = precioFinal(620);
        double resultado4 = precioFinal(459);
        double resultado5 = precioFinal(1035);
        double resultado6 = precioFinal(9407);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado6);

    }

    static double precioFinal(double numero1){
        return numero1 * 21 / 100 + numero1;

    }
}

