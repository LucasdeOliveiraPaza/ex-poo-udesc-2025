package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

class TestaCirculo {
    public static void main(String args[]) {
        Circulo bola = new Circulo();

        bola.setRaio(5);

        System.out.println("diametro:" + bola.calcularDiametro());
        System.out.println("perimetro:" + bola.calcularPerimetro());
        System.out.println("area:" + bola.calcularArea());
    }
}
