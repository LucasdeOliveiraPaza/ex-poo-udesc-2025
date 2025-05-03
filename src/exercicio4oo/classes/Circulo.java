package exercicio4oo.classes;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calcularDiametro() {
        return raio * 2;
    }

    public double calcularPerimetro() {
        return Math.PI * raio * 2;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }   
}
