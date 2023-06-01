package com.exaple;

import java.util.Vector;

public class VectorAmigas{

    public static void main(String[] args) {

        Vector<String> amigas = new Vector<>();

        amigas.add("Eugenia");
        amigas.add("Emilia");
        amigas.add("Micaela");
        amigas.add("Laura");
        amigas.add("Victoria");

        System.out.println("Amigas: " + amigas);

        amigas.remove(2);
        amigas.remove(1);
        System.out.println("Amigas: " + amigas);

    }

}
