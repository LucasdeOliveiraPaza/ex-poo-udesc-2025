package exercicio6oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private double nota1, nota2, nota3, nota4;

    public Aluno () {
        this.matricula = "";
        this.nome = "";
    }

    public Aluno (String matricula, String nome) {
        this();
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno (String matricula, String nome, int idade) {
        this(matricula, nome);
        this.idade = idade;
    }

    public Aluno (String matricula, String nome, int idade, double nota1, double nota2, double nota3, double nota4) {
        this(matricula, nome, idade);        
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setNota4(nota4);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (this.notaValida(nota1)) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (this.notaValida(nota2)) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (this.notaValida(nota3)) {
            this.nota3 = nota3;
        }
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        if (this.notaValida(nota4)) {
            this.nota4 = nota4;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4)/4.0;
    }

    public String buscarSituacao() {
        if (calcularMedia() < 7.0) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }

    private boolean notaValida(double nota) {
        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida será considerado como zero");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String txt =  "Objeto Aluno ["+
            "\n\tmatricula = %s" +
            "\n\tnome = %s" +
            "\n\tidade = %d" +
            "\n\tnota1 = %.1f" +
            "\n\tnota2 = %.1f" +
            "\n\tnota3 = %.1f" +
            "\n\tnota4 = %.1f" +
        "\n]";

        return String.format(txt, matricula, nome, idade, nota1, nota2, nota3, nota4);
    }
}
