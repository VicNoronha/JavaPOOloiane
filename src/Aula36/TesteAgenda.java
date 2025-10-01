package Aula36;

import java.util.Scanner;

public class TesteAgenda {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // 1. Configuração da Agenda
        System.out.println(">>> Configuração da Agenda <<<");
        System.out.print("Entre com o nome da Agenda: ");
        String nomeAgenda = scanner.nextLine();

        // Cria a instância da Agenda
        Agenda agenda = new Agenda(nomeAgenda);

        // Cria um array para armazenar 3 contatos
        Contato1[] contatos =  new Contato1[3];

        // 2. Coleta de Dados dos Contatos
        System.out.println("\n>>> Cadastro de Contatos <<<");
        for (int i=0; i<contatos.length; i++){
            System.out.println("---------------------------");
            System.out.println("Entre com as infos do Contato " + (i + 1) + ":");

            // Cria uma nova instância de Contato1
            Contato1 c = new Contato1();

            // Coleta e atribui o Nome
            System.out.print("Entre com o nome: ");
            String nome = scanner.nextLine();
            c.setNome(nome);

            // Coleta e atribui o Telefone (String)
            System.out.print("Entre com o telefone: ");
            String telefone = scanner.nextLine();
            c.setTelefone(telefone);

            // Coleta e atribui o E-mail
            System.out.print("Entre com o e-mail: ");
            String email = scanner.nextLine();
            c.setEmail(email);

            // Armazena o objeto Contato1 no array
            contatos[i] = c;
        }

        // 3. Vincula o array de Contatos à Agenda
        agenda.setContatos(contatos);

        // 4. Exibição das Informações
        System.out.println("\n>>> Relatório Final da Agenda <<<\n");


        System.out.println(agenda.obterInfo());

        scanner.close(); // Boa prática: fechar o Scanner
    }
}