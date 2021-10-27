package Ejercicio1;

public class TetraedroRegular extends FiguraTridimensional{

    //Atributos

    private double arista;
    private static final int CARAS=4;


    //Metodos


    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        this.arista = 1;
    }

    public double getArista() {
        return arista;
    }

    public double calcularVolumen(){

        double vol = (Math.sqrt(2)) * (Math.pow(getArista(), 3)) / 12;

        return vol;

    };

    public double calcularSuperficie(){

        double sup = (Math.sqrt(3)) * (Math.pow(getArista(), 2));

        return sup;

    };

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular ";
    }
}
