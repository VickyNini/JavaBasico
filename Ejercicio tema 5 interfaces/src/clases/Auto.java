package clases;
public class Auto {

    protected String marca;
    protected String modelo;
    protected int anio;
    protected String color;
    protected int litros;
    protected int kmxh;
    protected boolean cajaAutomatica;
    protected double motor;
    protected int puertas;
    protected boolean techoPanoramico;

    public Auto() {}

    public Auto(String marca, String modelo, int anio, String color, int litros, int kmxh, boolean cajaAutomatica, double motor, int puertas, boolean techoPanoramico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.litros = litros;
        this.kmxh = kmxh;
        this.cajaAutomatica = cajaAutomatica;
        this.motor = motor;
        this.puertas = puertas;
        this.techoPanoramico = techoPanoramico;
    }


}
