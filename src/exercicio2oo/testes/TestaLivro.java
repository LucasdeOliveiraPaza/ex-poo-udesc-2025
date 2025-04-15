package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

class TestaLivro {
    public static void main(String[] args) {
        Livro fundacao = new Livro();

        fundacao.titulo = "Fundação";
        fundacao.autor = "Isaac Asimov";
        fundacao.genero = "ficção cientifica";
        fundacao.emprestado = false;

        System.out.println("titulo:" + fundacao.titulo);
        System.out.println("autor:" + fundacao.autor);
        System.out.println("genero:" + fundacao.genero);
        System.out.println("emprestado:" + fundacao.emprestado);
    }
}
