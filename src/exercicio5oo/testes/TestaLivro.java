package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

class TestaLivro {
    public static void main(String[] args) {
        Livro fundacao = new Livro();

        fundacao.setTitulo("Fundação");
        fundacao.setAutor("Isaac Asimov");
        fundacao.setGenero("ficção cientifica");
        fundacao.setEmprestado(false);

        fundacao.emprestar();
        System.out.println("o livro " + fundacao.getTitulo() + " esta " + fundacao.verificarSituacao());
        fundacao.devolver();
        System.out.println("o livro " + fundacao.getTitulo() + " esta " + fundacao.verificarSituacao());
    }
}
