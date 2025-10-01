package Aula36;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    // --- Getters e Setters ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // --- Métodos de Lógica ---

    /**
     * Calcula e retorna a média das notas do aluno.
     * Retorna 0.0 se não houver notas para evitar divisão por zero.
     */
    public double obterMedia(){
        double soma = 0;

        // Verifica se o array é nulo ou vazio para evitar erros
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        for (double nota : notas){
            soma += nota;
        }

        // CORREÇÃO: Usa o tamanho real do array para o cálculo
        return  soma / notas.length;
    }

    /**
     * Retorna uma String contendo todas as informações do aluno, incluindo a média e o status.
     */
    public String obterInfo(){
        StringBuilder info = new StringBuilder();

        info.append(" | Aluno: ").append(nome);
        info.append(" | Matrícula: ").append(matricula);
        info.append(" | Notas: ");

        double soma = 0;
        if (notas != null) {
            for (double nota : notas){
                soma += nota;
                info.append(nota).append(" ");
            }
        }


        double media = obterMedia();

        info.append("\n"); // Quebra de linha para formatar a saída
        info.append(" | Média Final: ").append(media);

        // Lógica de aprovação/reprovação
        if (media >= 7.0){
            info.append(" -> Situação: Aprovado");
        } else {
            info.append(" -> Situação: Reprovado");
        }

        return info.toString();
    }
}
