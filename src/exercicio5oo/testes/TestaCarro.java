package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

class TestaCarro {
    public static void main(String[] args) {
        Carro ferrari = new Carro(
                "F8",
                "Ferrari",
                2023,
                295.0);

        System.out.println("Informações do Carro: " + ferrari);

        Carro uno = new Carro();

        uno.setModelo("uno");
        uno.setMarca("Fiat");
        uno.setAno(2012);
        uno.setVelocidade(0.0);

        while(uno.getVelocidade() < 300.0) {
            uno.acelerar();
            System.out.println("velocidade: " + uno.buscarVelocidade());
        }

        while (uno.getVelocidade() > 0.0) {
            uno.freiar();
            System.out.println("velocidade: " + uno.buscarVelocidade());
        }
    }
}
