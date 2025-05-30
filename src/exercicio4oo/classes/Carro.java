package exercicio4oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    double KILOMETRAGEM = 10.0;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        velocidade += KILOMETRAGEM;
    }

    public void freiar() {
        velocidade -= KILOMETRAGEM;
    }

    public double buscarVelocidade() {
        return getVelocidade();
    }
}
