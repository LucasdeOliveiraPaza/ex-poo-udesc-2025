package exercicio1oo;

class TestaContaBancaria {
    public static void main(String args[]) {
        ContaBancaria cb = new ContaBancaria();

        cb.numeroConta = "1123";
        cb.titular = "Lucas";
        cb.saldo = 8597.22;

        System.out.println("numero conta:" + cb.numeroConta);
        System.out.println("titular:" + cb.titular);
        System.out.println("saldo:" + cb.saldo);
    }
}
