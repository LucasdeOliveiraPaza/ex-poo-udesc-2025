package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

class TestaAluno {
    public static void main(String args[]) {
        Aluno lucas = new Aluno();

        lucas.setNome("Lucas de Oliveira Paza");
        lucas.setIdade(22);
        lucas.setMatricula("22123123214");
        lucas.setNota1(10);
        lucas.setNota2(11);
        lucas.setNota3(-20);
        lucas.setNota4(125);

        System.out.println("Nome:" + lucas.getNome());
        System.out.println("idade:" + lucas.getIdade());
        System.out.println("matricula:" + lucas.getMatricula());
        System.out.println("nota1:" + lucas.getNota1());
        System.out.println("nota2:" + lucas.getNota2());
        System.out.println("nota3:" + lucas.getNota3());
        System.out.println("nota4:" + lucas.getNota4());
    }
}
