package exercicio6oo.testes;

import exercicio6oo.classes.Carro;

class TestaCarro {
    public static void main(String[] args) {
        Carro ferrari = new Carro(
                "F8",
                "Ferrari",
                2023,
                295.0);

        System.out.println(ferrari);

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

        Carro focus = new Carro("Focus", "Ford");
        System.out.println(focus);

        Carro doblo = new Carro("Doblo","Fiat", 2012);
        System.out.println(doblo);
    }
}
