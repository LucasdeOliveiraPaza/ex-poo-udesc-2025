package exercicio6oo.testes;

import exercicio6oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String args[]) {
        Retangulo ret =  new Retangulo();

        ret.setAltura(23.5);
        ret.setLargura(12);

        System.out.println("Área 1: " + ret.calcularArea());

        Retangulo ret2 = new Retangulo(50, 30);
        System.out.println("Área 2: " + ret2.calcularArea());

        Retangulo ret3 = new Retangulo(1200, 1500);

        Retangulo ret4 = new Retangulo(800);

        System.out.println(ret);
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(ret4);
    }
}
