package Aula42ClasseFinal;

public class Aluno  {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
       // super(nome, endereco, telefone, cpf, curso, notas);
    }

    public Aluno() {

    }
    public String obterEtiquetaEndereco(){
        String s = "Endereco do Aluno: ";
    //    s += this.getEndereco();// ou super no lugar do this (?)
        return s;
    }
}









