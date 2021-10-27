package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Ortoedro ortoedro = new Ortoedro(6,8,9);
        Cubo cubo = new Cubo(8);
        TetraedroRegular tetraedroRegular = new TetraedroRegular(9);

        System.out.println(ortoedro.toString());
        System.out.println(ortoedro.calcularVolumen());
        System.out.println(ortoedro.calcularSuperficie());

        System.out.println();

        System.out.println(cubo.toString());
        System.out.println(cubo.calcularVolumen());
        System.out.println(cubo.calcularSuperficie());

        System.out.println();

        System.out.println(tetraedroRegular.toString());
        System.out.println(tetraedroRegular.calcularVolumen());
        System.out.println(tetraedroRegular.calcularSuperficie());

    }

}
