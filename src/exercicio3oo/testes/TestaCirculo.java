package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

class TestaCirculo {
    public static void main(String args[]) {
        Circulo bola = new Circulo();

        bola.setRaio(12.5);

        System.out.println("raio:" + bola.getRaio());
    }
}
