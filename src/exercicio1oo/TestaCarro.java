package exercicio1oo;

class TestaCarro {
    public static void main(String[] args) {
        Carro uno = new Carro();

        uno.modelo = "uno";
        uno.marca = "Fiat";
        uno.ano = 2012;
        uno.velocidade = 80.0;

        System.out.println("modelo:" + uno.modelo);
        System.out.println("marca:" + uno.marca);
        System.out.println("ano:" + uno.ano);
        System.out.println("velocidade:" + uno.velocidade);
    }
}
