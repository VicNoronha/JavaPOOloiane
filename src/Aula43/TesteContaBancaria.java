package Aula43;

public class TesteContaBancaria {
    public static void main (String[] args){

        System.out.println("----Teste Conta Bancária ----");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente(" Maria Elisa");
        contaSimples.setNumConta ("1111");

        contaSimples.depositar(100.0);

        realizarSaque(contaSimples, 50.0);
        realizarSaque(contaSimples, 50.0);
        realizarSaque(contaSimples, 70.0);
        System.out.println(contaSimples);

        // 1. Saque inicial com tratamento manual
        if (contaSimples.sacar(50.0)){ // Use double .0
            System.out.println("Saque efetuado com Sucesso, novo saldo = " + contaSimples.getSaldo());
        } else {
            System.out.println("Saldo insuficiente ");
        }


        System.out.println(contaSimples);
    }

    // Método auxiliar
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){ // CORREÇÃO: Tipo ContaBancaria e Parênteses no if
            System.out.println("Saque de " + valor + " efetuado com Sucesso. Novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("ERRO! Saldo insuficiente para sacar " + valor);
        }
    }

    
}