package exercicio6oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

     public ContaBancaria () {
        this.numeroConta = "";
        this.titular = "";
    }

    public ContaBancaria (String numeroConta) {
        this();
        this.numeroConta = numeroConta;
    }

    public ContaBancaria (String numeroConta, String titular) {
        this(numeroConta);
        this.titular = titular;
    }

    public ContaBancaria (String numeroConta, String titular, double saldo) {
        this(numeroConta, titular);
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
        String txt = "Objeto ContaBancaria ["+
            "\n\tnumeroConta = %s" +
            "\n\ttitular = %s" +
            "\n\tsaldo = %.2f" +
        "\n]";

        return String.format(txt, numeroConta, titular, saldo);
    }
}
