package exercicio6oo.testes;

import exercicio6oo.classes.Aluno;

class TestaAluno {
    public static void main(String args[]) {
        Aluno lucas = new Aluno(
            "22123123214",
            "Lucas de Oliveira Paza",
            22,
            10,
            7,
            8,
            9.5
        );

        System.out.println(lucas);
        System.out.println("media: " + lucas.calcularMedia());
        System.out.println("situacao: " + lucas.buscarSituacao());

        Aluno fulano = new Aluno();

        fulano.setNome("Fulano Fuleiro da Funileira");
        fulano.setMatricula("40028922");
        fulano.setIdade(92);
        fulano.setNota1(11);
        fulano.setNota2(-17);
        fulano.setNota3(6);
        fulano.setNota4(10);

        System.out.println(fulano);
        System.out.println("media: " + fulano.calcularMedia());
        System.out.println("situacao: " + fulano.buscarSituacao());


        Aluno sandy = new Aluno("3363", "Sandy Bochechas");
        System.out.println(sandy);

        Aluno bob = new Aluno("1234", "Bob Esponja Calça Programada", 26);
        System.out.println(bob);
    }
}
