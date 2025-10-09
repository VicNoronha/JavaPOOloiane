package Aula43;

import java.util.Arrays;

public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        // super(nome, endereco, telefone, cpf, curso, notas);
    }

    public Aluno() {
        super();
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereco do Aluno: ";
        //    s += this.getEndereco();// ou super no lugar do this (?)
        return s;
    }

    public void setNotas(double[] notas) {
    }

    public void setCurso(String cienciaDaComputação) {
    }

//    public String toString() {
//        String s = curso + "/n";
//        for (double nota : notas) {
//            s += nota + " ";
//        }
//        return s;
//    }


    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}








