package com.exaple;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FicheroEjemplo {
    public static void main(String[] args) {

        try{
            InputStream fileIn = new FileInputStream("C:\\Users\\ViiCky\\IdeaProjects\\Java\\Ejercicio temas 7 - 8 - 9\\xcpt VICKY 20-04-14 19.17.18.txt");
            byte[]datos = fileIn.readAllBytes();

            PrintStream fileOn = new PrintStream("destino.txt");
            fileOn.write(datos);

            fileIn.close();
            fileOn.close();

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Copiando...");

        }


    }


}
