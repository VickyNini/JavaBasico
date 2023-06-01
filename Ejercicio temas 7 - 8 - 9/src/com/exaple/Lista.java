package com.exaple;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<String> amigas = new ArrayList<>();
        amigas.add("Eugenia");
        amigas.add("Emilia");
        amigas.add("Micaela");
        amigas.add("Laura");

        for (String nombre : amigas){
            System.out.println(nombre);
        }
        System.out.println(" ");

        LinkedList<String> listaenlazada = new LinkedList<>(amigas);

        for (String nombres : listaenlazada) {
            System.out.println(nombres);
        }
        System.out.println(" ");

        ArrayList<Integer> contador = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            contador.add(i+1);
            System.out.println(contador.get(i));
        }
        System.out.println(" ");

        for (int i = 0; i < contador.size(); i++){
            if ( contador.get(i) % 2 == 0){
                contador.remove(i);
                i = i-1;
            }else {
                System.out.println(contador.get(i));
            }
        }

    }
}
