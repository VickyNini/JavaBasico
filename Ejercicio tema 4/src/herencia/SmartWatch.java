package herencia;

import clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    public String malla;
    public boolean pantallaRedonda;
    public boolean nfc;
    public boolean compatibilidad;
    public String datos;


    public SmartWatch (String modelo, String marca, String sistemaOperativo, String cargador, String color, double dimnesionPantalla, int bateria, boolean resistenciaAgua, int pixeles, String malla, boolean pantallaRedonda, boolean nfc, boolean compatibilidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.cargador = cargador;
        this.color = color;
        this.dimnesionPantalla = dimnesionPantalla;
        this.bateria = bateria;
        this.resistenciaAgua = resistenciaAgua;
        this.pixeles = pixeles;
        this.malla = malla;
        this.pantallaRedonda = pantallaRedonda;
        this.nfc = nfc;
        this.compatibilidad = compatibilidad;
    }

    public SmartWatch(String datos) {
        this.datos = datos;
    }

    public void imprimir(String caracteristicas){
        this.datos = caracteristicas;

        System.out.println("- "+this.modelo+" caracteristicas:");
        System.out.println(this.marca);
        System.out.println(this.sistemaOperativo);
        System.out.println("Compatible con otros sistemas operativos: "+this.compatibilidad);
        System.out.println("Cagador "+this.cargador);
        System.out.println("Color: "+this.color);
        System.out.println(this.dimnesionPantalla+" pulgadas");
        System.out.println("Pantalla redonda: "+this.pantallaRedonda);
        System.out.println(this.pixeles+ " pixeles");
        System.out.println("Color de la malla: "+this.malla);
        System.out.println("NFC: "+this.nfc);
        System.out.println(this.bateria+" mAh");
        System.out.println("Resistente al agua: "+this.resistenciaAgua);
    }



}
