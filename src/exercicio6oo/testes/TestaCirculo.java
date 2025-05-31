package exercicio6oo.testes;

import exercicio6oo.classes.Circulo;

class TestaCirculo {
    public static void main(String args[]) {
        Circulo bola = new Circulo();

        bola.setRaio(5);

        System.out.println("diametro:" + bola.calcularDiametro());
        System.out.println("perimetro:" + bola.calcularPerimetro());
        System.out.println("area:" + bola.calcularArea());

        Circulo grande = new Circulo(1500);
        Circulo pequeno = new Circulo(25);
        System.out.println(pequeno);
        System.out.println(grande);
    }
}
