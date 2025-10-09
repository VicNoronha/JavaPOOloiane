package Aula40;

public class Professor extends Pessoa {


    public Professor(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public Professor() {

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


