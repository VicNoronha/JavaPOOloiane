package Aula41ClasseAbstrata;

public class Aluno extends AbstractPessoa {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        super(nome, endereco, telefone, cpf, curso, notas);
    }

    public Aluno() {

    }

    @Override
    public void imprimirTelefoneCelular(){
        System.out.println("Telefone Aluno: "+ getTelefoneCelular());
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereco do Aluno: ";
        s += this.getEndereco();// ou super no lugar do this (?)
        return s;
    }
}









