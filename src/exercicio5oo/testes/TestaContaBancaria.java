package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

class TestaContaBancaria {
    public static void main(String args[]) {
        ContaBancaria cb = new ContaBancaria();
        ContaBancaria cnt = new ContaBancaria("7070", "Milionario e José Rico", 8000000);

        cb.setNumeroConta("1123");
        cb.setTitular("Lucas");
        cb.setSaldo(-8000.0);

        cb.depositar(1000);
        cb.depositar(-1000);

        System.out.println("saldo: " + cb.buscarSaldo());

        cb.sacar(3000);
        cb.sacar(-3000);

        System.out.println("saldo: " + cb.buscarSaldo());

        System.out.println(cb);
        System.out.println(cnt);
    }
}
