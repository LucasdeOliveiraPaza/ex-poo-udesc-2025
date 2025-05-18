package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura >= 0 && largura <=1000) {
            this.largura = largura;
        }else{
            throw new IllegalArgumentException("Largura invalida, deve estar entre 0 e 1000");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0 && altura <=1000) {
            this.altura = altura;
        }else{
            throw new IllegalArgumentException("Altura invalida, deve estar entre 0 e 1000");
        }
    }

    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public String toString() {
        return "Largura: " + largura + ", Altura: " + altura + ", Area: " + calcularArea();
    }
}
