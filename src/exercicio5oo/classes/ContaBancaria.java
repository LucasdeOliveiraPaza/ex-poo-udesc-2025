package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

     public ContaBancaria () {
        this.numeroConta = "";
        this.titular = "";
    }

    public ContaBancaria (String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
        } 
    }

    public double buscarSaldo() {
        return getSaldo();
    }

    @Override
    public String toString() {
        return "Objeto ContaBancaria ["+
            "\n\tnumeroConta = " + numeroConta +
            "\n\ttitular = " + titular +
            "\n\tsaldo = " + saldo +
        "\n]";
    }
}
