package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

class TestaContaBancaria {
    public static void main(String args[]) {
        ContaBancaria cb = new ContaBancaria();

        cb.setNumeroConta("1123");
        cb.setTitular("Lucas");
        cb.setSaldo(8597.22);

        System.out.println("numero conta:" + cb.getNumeroConta());
        System.out.println("titular:" + cb.getTitular());
        System.out.println("saldo:" + cb.getSaldo());
    }
}
