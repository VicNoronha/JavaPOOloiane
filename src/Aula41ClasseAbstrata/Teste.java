package Aula41ClasseAbstrata;


public class Teste {
    public static void main (String [] args) {

      //  AbstractPessoa pessoa = new AbstractPessoa();
       // pessoa.setEndereco("Rua 24, num 2");

        AbstractPessoa aluno = new Aluno();
        aluno.setEndereco("Rua 2, num 2");
        aluno.setCpf("1234");
        aluno.setTelefoneCelular("9999-999");

        System.out.println(aluno);
        aluno.imprimirCPF();
        aluno.imprimirTelefoneCelular();

        AbstractPessoa professor = new Professor();
        professor.setEndereco("Rua 3, num 3");
        professor.setCpf("2342342");
        professor.setTelefoneCelular("9999-777");

        professor.imprimirCPF();
        professor.imprimirTelefoneCelular();
        System.out.println(professor);



       // AbstractPessoa pessoa = new Animal();

    }
}
