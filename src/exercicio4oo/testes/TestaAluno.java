package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

class TestaAluno {
    public static void main(String args[]) {
        Aluno lucas = new Aluno();

        lucas.setNome("Lucas de Oliveira Paza");
        lucas.setIdade(22);
        lucas.setMatricula("22123123214");
        lucas.setNota1(10);
        lucas.setNota2(7);
        lucas.setNota3(7);
        lucas.setNota4(6);

        System.out.println("media: " + lucas.calcularMedia());
        System.out.println("situacao: " + lucas.buscarSituacao());
    }
}
