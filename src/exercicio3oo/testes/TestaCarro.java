package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

class TestaCarro {
    public static void main(String[] args) {
        Carro uno = new Carro();

        uno.setModelo("uno");
        uno.setMarca("Fiat");
        uno.setAno(2012);
        uno.setVelocidade(80.0);

        System.out.println("modelo:" + uno.getModelo());
        System.out.println("marca:" + uno.getMarca());
        System.out.println("ano:" + uno.getAno());
        System.out.println("velocidade:" + uno.getVelocidade());
    }
}
