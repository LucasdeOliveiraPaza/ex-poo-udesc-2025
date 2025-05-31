package exercicio6oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    final double KILOMETRAGEM = 10.0;

    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.velocidade = 0.0;
    }

    public Carro(String modelo, String marca) {
        this();
        this.modelo = modelo;
        this.marca = marca;
    }

     public Carro(String modelo, String marca, int ano) {
        this(modelo, marca);
        this.ano = ano;
     }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this(modelo, marca, ano);
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
        String txt =  "Objeto Carro ["+
            "\n\tmodelo = %s" +
            "\n\tmarca = %s" +
            "\n\tano = %d" +
            "\n\tvelocidade = %.2f"+
        "\n]";
        return String.format(txt, modelo, marca, ano, velocidade);
    }
}
