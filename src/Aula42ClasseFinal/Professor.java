package Aula42ClasseFinal;

public class Professor  {


    public Professor(String nome, String endereco, String telefone, String cpf) {
        super();
    }

    public Professor() {

    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = " Endereco Professor";
      //  s += super.getEndereco();
        return  s;
    }
}


