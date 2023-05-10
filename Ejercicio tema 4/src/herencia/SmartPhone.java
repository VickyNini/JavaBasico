package herencia;

import clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String camaraTrasera;
    public double camaraFrontal;
    public double peso;
    public double alto;
    public double ancho;
    public double volumen;
    public int ram;
    public int memoria;
    public String datos;


    public SmartPhone() {}

    public SmartPhone(String modelo, String marca, String sistemaOperativo, String cargador, String color, double dimnesionPantalla, int bateria, boolean resistenciaAgua, int pixeles, String camaraTrasera, double camaraFrontal, double peso, double alto, double ancho, double volumen, int ram, int memoria) {
        super(modelo, marca, sistemaOperativo, cargador, color, dimnesionPantalla, bateria, resistenciaAgua, pixeles);
        this.camaraTrasera = camaraTrasera;
        this.camaraFrontal = camaraFrontal;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.volumen = volumen;
        this.ram = ram;
        this.memoria = memoria;
    }

    public SmartPhone(String datos) {
        this.datos = datos;
    }


    public void imprimir(String caracteristicas) {
        this.datos = caracteristicas;

        System.out.println("- " + this.modelo + " caracteristicas:");
        System.out.println(this.marca);
        System.out.println(this.sistemaOperativo);
        System.out.println("Cagador: " + this.cargador);
        System.out.println("Color: " + this.color);
        System.out.println(this.dimnesionPantalla + " pulgadas");
        System.out.println("Alto: " + this.alto);
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Peso: " + this.peso);
        System.out.println(this.pixeles + " pixeles");
        System.out.println("Camara trasera: " + this.camaraTrasera);
        System.out.println("Camara frontal: " + this.camaraFrontal);
        System.out.println("RAM: " + this.ram);
        System.out.println("Memoria: " + this.memoria);
        System.out.println(this.bateria + " mAh");
        System.out.println("Resistente al agua: " + this.resistenciaAgua);
        System.out.println("Volumen: " + this.volumen);
    }

}
