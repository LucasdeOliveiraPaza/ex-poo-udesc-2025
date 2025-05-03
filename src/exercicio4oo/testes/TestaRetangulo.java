package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String args[]) {
       Retangulo ret =  new Retangulo();

       ret.setAltura(23.5);
       ret.setAltura(14.6);

       System.out.println("altura:" + ret.getAltura());
       System.out.println("largura:" + ret.getLargura());
    }
}
