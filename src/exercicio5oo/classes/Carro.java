package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    double KILOMETRAGEM = 10.0;

    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.velocidade = 0.0;
    }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade);
    }

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
        if (velocidade < 0) {
            this.velocidade = 0;
        } else if (velocidade > 300) {
            this.velocidade = 300;
        } else {
            this.velocidade = velocidade;
        }

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

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h";
    }
}
