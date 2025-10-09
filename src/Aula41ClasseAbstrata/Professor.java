package Aula41ClasseAbstrata;

public class Professor extends AbstractPessoa {


    public Professor(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public Professor() {

    }

    @Override
    public void imprimirTelefoneCelular(){
        System.out.println("Telefone Professor: "+ getTelefoneCelular());
    }



    public double calcularSalarioLiquido(){
        return 0;
    }

    // Não entendi direito oq foi feito nesse bloco
    public String obterEtiquetaEndereco(){
        String s = " Endereco Professor";
        s += super.getEndereco();
        return  s;
    }
}


