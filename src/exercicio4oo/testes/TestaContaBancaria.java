package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

class TestaContaBancaria {
    public static void main(String args[]) {
        ContaBancaria cb = new ContaBancaria();

        cb.setNumeroConta("1123");
        cb.setTitular("Lucas");
        cb.setSaldo(8000.0);

        cb.depositar(1000);

        System.out.println("saldo: " + cb.buscarSaldo());

        cb.sacar(3000);

        System.out.println("saldo: " + cb.buscarSaldo());
    }
}
