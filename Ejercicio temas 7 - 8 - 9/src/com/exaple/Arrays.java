package com.exaple;

public class Arrays {

    public static void main(String[] args) {

        String[] amigas = { "Eugenia", "Emilia", "Laura", "Micaela", "Victoria"};

        for (String i: amigas) {
            System.out.println(i);
        }

        System.out.println(" ");

        int[][] edades = new int[3][2];
        edades[0][0] = 1993;
        edades[0][1] = 30;

        edades[1][0] = 1994;
        edades[1][1] = 29;

        edades[2][0] = 1995;
        edades[2][1] = 28;

        for (int i = 0; i < edades.length; i++) {

            for (int j = 0; j < edades[1].length; j++){
                System.out.println("Posicion: i = " + i + " j = " + j);
                System.out.println(edades[i][j]);
            }
        }
    }
}
