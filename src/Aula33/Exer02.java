package Aula33;

public class Exer02 {
    public static void main (String [] args){
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo();

        System.out.println(" Saldo da Conta " + conta.getNumero() + " = "
        + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println(" Saque efetuado com sucesso");
            conta.consultarSaldo();
        }

    }
}
