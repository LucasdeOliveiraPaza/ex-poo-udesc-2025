package exercicio1oo;

class TestaAluno {
    public static void main(String args[]) {
        Aluno lucas = new Aluno();

        lucas.nome = "Lucas de Oliveira Paza";
        lucas.idade = 22;
        lucas.matricula = "22123123214";
        lucas.nota1 = 10;
        lucas.nota2 = 11;
        lucas.nota3 = -20;
        lucas.nota4 = 125;

        System.out.println("Nome:" + lucas.nome);
        System.out.println("idade:" + lucas.idade);
        System.out.println("matricula:" + lucas.matricula);
        System.out.println("nota1:" + lucas.nota1);
        System.out.println("nota2:" + lucas.nota2);
        System.out.println("nota3:" + lucas.nota3);
        System.out.println("nota4:" + lucas.nota4);
    }
}
