package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String args[]) {
       Retangulo ret =  new Retangulo();

       ret.altura = 23.5;
       ret.largura = 14.6;

       System.out.println("altura:" + ret.altura);
       System.out.println("largura:" + ret.largura);
    }
}
