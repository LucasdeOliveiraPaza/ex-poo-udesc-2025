package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String args[]) {
       Retangulo ret =  new Retangulo();

       ret.setAltura(23.5);
       ret.setLargura(12);

       System.out.println("area: " + ret.calcularArea());
    }
}
