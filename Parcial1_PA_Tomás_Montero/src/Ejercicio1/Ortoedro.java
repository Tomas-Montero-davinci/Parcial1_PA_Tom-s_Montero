package Ejercicio1;

public class Ortoedro extends FiguraTridimensional{

    //Atributos
    private double ancho;
    private double base;
    private double altura;
    private static final int CARAS=6;

    //Metodos

    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    public double getAncho() {
        return ancho;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularVolumen(){

        double vol=getAncho()*getBase()*getAltura();

        return vol;

    };

    public double calcularSuperficie(){

        double sup = 2*(getAncho()*getBase())+2* (getAncho()*getAltura())+2*(getBase()*getAltura());

        return sup;

    };

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }
}
