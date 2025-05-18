package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String args[]) {
       Retangulo ret =  new Retangulo();

       ret.setAltura(23.5);
       ret.setLargura(12);

       System.out.println("Área 1: " + ret.calcularArea());

       Retangulo ret2 = new Retangulo(50, 30);
       System.out.println("Área 2: " + ret2.calcularArea());

        try {
            Retangulo ret3 = new Retangulo(1200, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar Retângulo 3: " + e.getMessage());
        }
    }
}
