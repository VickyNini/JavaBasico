package com.example;

public class TiposDeVariables {

    public static void main(String[] args) {

        String variable0 = "Variables numericas enteras";
        System.out.println(variable0);

        byte variable1 = 9;
        System.out.println("byte: " + variable1);

        short variable2 = 5;
        System.out.println("short: " + variable2);

        long variable3 = 1584369452;
        System.out.println("long: " + variable3);

        int variable4 = 7;
        System.out.println("int: " + variable4);


        variable0 = "Variables numericas decimales";
        System.out.println(variable0);

        float variable5 = 45.96f;
        System.out.println("float: " + variable5);

        double variable6 = 85.13884266d;
        System.out.println("double: " + variable6);

        variable0 = "Variables boolean";
        System.out.println(variable0);

        boolean variable7 = true;
        boolean variable8 = false;
        System.out.println("boolean a: " + variable7);
        System.out.println("boolean b: " + variable8);

    }
}
