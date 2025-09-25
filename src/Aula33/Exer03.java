package Aula33;

import java.util.Scanner;
import java.util.InputMismatchException; // Para tratar entrada não numérica

public class Exer03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        try {
            System.out.println("Entre com o nome do aluno:");
            aluno.setNome(scanner.nextLine()); // Use nextLine() para ler a linha inteira

            System.out.println("Entre com o nome do curso:");
            aluno.setNomeCurso(scanner.nextLine()); // Use nextLine()

            System.out.println("Entre com a matrícula do aluno:");
            aluno.setMatricula(scanner.nextLine()); // Use nextLine()

            for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                System.out.println("Entre com o nome da disciplina " + (i + 1) + ":");
                // Correção: setNomeDisciplinaPos(índice, String)
                aluno.setNomeDisciplinaPos(i, scanner.nextLine());
            }

            for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
                System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i] + ":");
                for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                    System.out.println("Entre com a nota " + (j + 1) + ":");
                    // Correção: use nextDouble() para ler double e consumir o \n
                    aluno.setNotaPosIJ(i, j, scanner.nextDouble());
                    // Consumir o \n restante após nextDouble()
                    scanner.nextLine();
                }
            }

            aluno.mostrarInfo(); // Chamada correta do método

            System.out.println("\n--- Resultados de Aprovação ---");
            for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                if (aluno.verificarAprovado(i)) {
                    // Correção: chamar o getter para acessar o array
                    System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " foi APROVADO");
                } else {
                    // Correção: chamar o getter para acessar o array
                    System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " foi REPROVADO");
                }
            }

        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Certifique-se de digitar números onde esperado.");
        } finally {
            scanner.close(); // Fechar o scanner para liberar recursos
        }
    }
}
