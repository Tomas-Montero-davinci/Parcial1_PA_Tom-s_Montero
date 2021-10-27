package Ejercicio1;

public class Cubo extends FiguraTridimensional{

    //Atributos

    private double lado;
    private static final int CARAS=6;

    //Metodos


    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado = 1;
    }

    public double getLado() {
        return lado;
    }

    public double calcularVolumen(){

        double vol = Math.pow(getLado(), 3);

        return vol;

    };

    public double calcularSuperficie(){

        double sup = 6 * (Math.pow(getLado(), 2));

        return sup;

    };

    @Override
    public String toString() {
        return "La figura es un Cubo ";
    }
}
