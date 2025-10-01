package Aula36;

import java.util.Scanner;

public class TesteCurso {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // 1. Coleta de dados do Curso
        System.out.println("Entre com o nome do curso:");
        String nome = scanner.nextLine();

        System.out.println("Entre com o horário do curso:");
        String horario = scanner.nextLine();

        // 2. Coleta de dados do Professor
        System.out.println("\n--- Dados do Professor ---");
        System.out.println("Entre com o nome do professor:");
        String nomeProf = scanner.nextLine();


        System.out.println("Entre com o departamento do professor:");
        String departamentoProf = scanner.nextLine();

        System.out.println("Entre com o e-mail do professor:");
        String emailProf = scanner.nextLine();

        // 3. Criação e Atribuição do Curso e Professor
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);


        professor.setDepartamento(departamentoProf);

        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        // 4. Coleta de dados e Cadastro de Alunos
        Aluno[] alunos = new Aluno [5];

        System.out.println("\n--- Cadastro de Alunos (5) ---");

        for (int i = 0; i < 5; i++){


            System.out.println("\nEntre com o nome do aluno " + (i + 1) + ":");
            String nomeAluno = scanner.nextLine(); // Deve funcionar corretamente agora.

            System.out.println("Entre com a matrícula do aluno:");
            String matricula = scanner.nextLine();

            double [] notas = new double[4];
            for (int j = 0; j < 4; j++){
                System.out.println("Digite a nota " + (j + 1) + ":");



                notas[j] = scanner.nextDouble();
            }

            scanner.nextLine();

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        // 5. Fechamento do Scanner (Boas Práticas)
        scanner.close();
        System.out.println(curso.obterInfo());

    }
}
