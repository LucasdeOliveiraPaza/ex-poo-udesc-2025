package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

class TestaCarro {
    public static void main(String[] args) {
        Carro uno = new Carro();

        uno.setModelo("uno");
        uno.setMarca("Fiat");
        uno.setAno(2012);
        uno.setVelocidade(0.0);

        while(uno.getVelocidade() < 100.0) {
            uno.acelerar();
            System.out.println("velocidade: " + uno.buscarVelocidade());
        }

        while (uno.getVelocidade() > 0.0) {
            uno.freiar();
            System.out.println("velocidade: " + uno.buscarVelocidade());
        }
    }
}
