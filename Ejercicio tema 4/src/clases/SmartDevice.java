package clases;

public class SmartDevice {

    // atributos

    protected String modelo;
    protected String marca;
    protected String sistemaOperativo;
    protected String cargador;
    protected String color;
    protected double dimnesionPantalla;
    protected int bateria;
    protected boolean resistenciaAgua;
    protected int pixeles;

    // constructores
    public SmartDevice() {}

    public SmartDevice(String modelo, String marca, String sistemaOperativo, String cargador, String color, double dimnesionPantalla, int bateria, boolean resistenciaAgua, int pixeles) {
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.cargador = cargador;
        this.color = color;
        this.dimnesionPantalla = dimnesionPantalla;
        this.bateria = bateria;
        this.resistenciaAgua = resistenciaAgua;
        this.pixeles = pixeles;
    }

    // metodos


}
