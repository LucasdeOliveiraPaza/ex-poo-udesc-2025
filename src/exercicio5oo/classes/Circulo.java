package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){
        this.raio = 0.0;
    }

    public Circulo(double raio) {
        setRaio(raio);
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= 0 && raio <= 1000) {
            this.raio = raio;
        } else {
            System.out.println("Valor inválido para o raio. Deve estar entre 0 e 1000.");
        }
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
    
    @Override
    public String toString() {
        return "Círculo raio = " + raio;
    }
    
}
