package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

class TestaLivro {
    public static void main(String[] args) {
        Livro fundacao = new Livro();

        fundacao.setTitulo("Fundação");
        fundacao.setAutor("Isaac Asimov");
        fundacao.setGenero("ficção cientifica");
        fundacao.setEmprestado(false);

        System.out.println("titulo:" + fundacao.getTitulo());
        System.out.println("autor:" + fundacao.getAutor());
        System.out.println("genero:" + fundacao.getGenero());
        System.out.println("emprestado:" + fundacao.isEmprestado());
    }
}
