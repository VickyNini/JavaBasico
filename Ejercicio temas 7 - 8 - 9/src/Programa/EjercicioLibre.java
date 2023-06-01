package Programa;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.*;

public class EjercicioLibre {

    public static void main(String[] args) {
        //lee fichero InputStream, crea fichero PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array
        System.out.println("Bienvenid@ al gimnasio durazno!");

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(59671486, "Luz Maria Perez Garcia");
        mapa.put(40123652, "Diego Gomez");
        mapa.put(35987154, "Ana Laura Lopez");
        mapa.put(26485123, "Lorena Cortez");
        mapa.put(45123651, "Facundo Paredez");

        try{
            InputStream fichero = new FileInputStream("C:\\Users\\ViiCky\\IdeaProjects\\Java\\Ejercicio temas 7 - 8 - 9\\src\\Programa\\DatosCliente.txt");

            boolean listo = true;
            do{
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Si desea ingresar un cliente nuevo presione s, de lo contraro cualquier letra");
                    String s = scanner.nextLine();
                    try {
                        if (Objects.equals(s, "s")){
                            byte[] datos = fichero.readAllBytes();
                            System.out.println("Ingrese los siguientes datos:");
                            for (byte dato: datos){
                                System.out.print((char) dato);
                            }
                            System.out.println("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.println("DNI: ");
                            int dni = scanner.nextInt();
                            mapa.put(dni,nombre);
                            fichero.close();
                        }else listo = false;

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }while (listo);

            listo = true;
            do{
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Si desea eliminar un cliente nuevo presione s, de lo contraro cualquier letra");
                    String s = scanner.nextLine();
                    try {
                        if (Objects.equals(s, "s")){
                            System.out.println("Estos son los clientes actuales: \n" + mapa);
                            System.out.println("Ingrese el nombre del cliente: ");
                            String nombre = scanner.nextLine();
                            System.out.println("DNI: ");
                            int dni = scanner.nextInt();
                            mapa.remove(dni,nombre);
                        }else listo = false;

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }while (listo);

        }catch (IOException e){
            System.out.println("Error IOException: "+ e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<String> DNI = new ArrayList<>();

        try {
            PrintStream listaNombres = new PrintStream("C:\\Users\\ViiCky\\IdeaProjects\\Java\\Ejercicio temas 7 - 8 - 9\\src\\Programa\\Nombres.txt");
            PrintStream listaDNI = new PrintStream("C:\\Users\\ViiCky\\IdeaProjects\\Java\\Ejercicio temas 7 - 8 - 9\\src\\Programa\\DNI.txt");
            for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                clientes.add(value);
                DNI.add(key.toString());
            }

            listaNombres.write(String.valueOf(clientes).getBytes());
            listaDNI.write(String.valueOf(DNI).getBytes());

            listaNombres.close();
            listaDNI.close();

        } catch (FilerException e) {
            System.out.println("Error: FilerException" + e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("Esta es la lista de clientes: " + clientes);
            System.out.println("Esta es la lista de DNIs: " + DNI);
        }
    }
}
