package Aula36;

import java.text.DecimalFormat; // Importa para formatar a média

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    // --- Getters e Setters (Mantidos por convenção) ---

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    // --- Métodos de Lógica e Relatório ---

    /**
     * Calcula e retorna a média das médias de todos os alunos da turma.
     */
    public double obterMediaTurma () {
        double soma = 0;

        if (alunos == null || alunos.length == 0) {
            return 0.0; // Previne divisão por zero
        }

        for (Aluno aluno : alunos) {
            if (aluno != null) {
                // Chama o obterMedia() de cada Aluno
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }

    /**
     * Gera uma String de relatório completa do curso, professor, alunos e média da turma.
     */
    public String obterInfo(){
        StringBuilder info = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.##"); // Formata a média da turma com 2 casas decimais

        info.append(">>> RELATÓRIO DO CURSO <<<\n");
        info.append("Nome do Curso: ").append(nome).append("\n");
        info.append("Horário: ").append(horario).append("\n");

        // 1. Informações do Professor
        if (professor != null){
            info.append("\n--- Informações do Professor ---\n");
            // Assume que professor.obterInfo() retorna uma String bem formatada
            info.append(professor.obterInfo()).append("\n");
        }

        // 2. Informações dos Alunos (COM MÉDIAS INDIVIDUAIS)
        if (alunos != null){
            info.append("\n--- Alunos Matriculados ---\n");

            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    // ESSA LINHA É CRUCIAL: Chama o método obterInfo() da classe Aluno,
                    // que retorna a String contendo a média individual.
                    info.append(aluno.obterInfo()).append("\n");
                }
            }

            // 3. Média da Turma
            double mediaTurma = obterMediaTurma();
            info.append("\n--- RESUMO DA TURMA ---\n");
            info.append("Média Geral da Turma: ").append(df.format(mediaTurma)).append("\n");
        } else {
            info.append("\n(Nenhum aluno matriculado neste curso.)\n");
        }

        return info.toString();
    }
}