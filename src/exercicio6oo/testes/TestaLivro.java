package exercicio6oo.testes;

import exercicio6oo.classes.Livro;

class TestaLivro {
    public static void main(String[] args) {
        Livro fundacao = new Livro();
        Livro inferno = new Livro("Inferno", "Dan Brown", "misterio", true);

        fundacao.setTitulo("Fundação");
        fundacao.setAutor("Isaac Asimov");
        fundacao.setGenero("ficção cientifica");
        fundacao.setEmprestado(false);

        fundacao.emprestar();
        System.out.println("o livro " + fundacao.getTitulo() + " esta " + fundacao.verificarSituacao());
        fundacao.devolver();
        System.out.println("o livro " + fundacao.getTitulo() + " esta " + fundacao.verificarSituacao());

        inferno.emprestar();
        System.out.println("o livro " + inferno.getTitulo() + " esta " + inferno.verificarSituacao());
        inferno.devolver();
        System.out.println("o livro " + inferno.getTitulo() + " esta " + inferno.verificarSituacao());
        inferno.devolver();
        System.out.println("o livro " + inferno.getTitulo() + " esta " + inferno.verificarSituacao());

        System.out.println(fundacao);
        System.out.println(inferno);
    }
}
