package exercicio6oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro () {
        this.titulo = "";
        this.autor = "";
        this.genero = ""; 
    }

    public Livro (String titulo) {
        this();
        this.titulo = titulo;
    }

    public Livro (String titulo, String autor) {
        this(titulo);
        this.autor = autor;
    }

    public Livro (String titulo, String autor, String genero, boolean emprestado) {
        this(titulo, autor);
        this.genero = genero; 
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public void emprestar() {
        if (!this.emprestado) {
            setEmprestado(true);
        } else {
            System.out.println("esse livro já foi emprestado");
        }
    }

    public void devolver() {
        if (this.emprestado) {
            setEmprestado(false);
        } else {
            System.out.println("esse livro já foi devolvido");
        }
    }

    public String verificarSituacao() {
        return emprestado ? "Indisponivel" : "Disponivel";
    }

    @Override
    public String toString() {
        String txt = "Objeto Livro ["+
            "\n\ttitulo = %s" +
            "\n\tautor = %s" +
            "\n\tgenero = %s" +
            "\n\temprestado = %b" +
        "\n]";

        return String.format(txt, titulo, autor, genero, emprestado);
    }
}
