package Aula33;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas; // Não inicializar aqui, deixar para o construtor ou setter
    private double[][] notasDisciplinas; // Não inicializar aqui, deixar para o construtor ou setter

    public Aluno(){
        this.nomeDisciplinas = new String[3]; // Inicialização no construtor padrão
        this.notasDisciplinas = new double[3][4]; // Inicialização no construtor padrão
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3]; // Inicialização no construtor parametrizado
        this.notasDisciplinas = new double[3][4]; // Inicialização no construtor parametrizado
    }

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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() { // Nome do método corrigido: mostrarInfo
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula()); // Usando getter
        System.out.println("Nome do Curso: " + getNomeCurso()); // Usando getter

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina: " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " "); // Usar print para imprimir na mesma linha
            }
            System.out.println(); // Nova linha após cada disciplina
        }
    }

    public boolean verificarAprovado(int indice) {
        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    // Este é um método auxiliar, então 'private' é apropriado
    private double obterMedia(int indice) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        // Correção aqui: usar notasDisciplinas[indice].length para a média
        double media = soma / notasDisciplinas[indice].length;
        return media;
    }

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
        // Validação básica para evitar ArrayIndexOutOfBoundsException
        if (pos >= 0 && pos < nomeDisciplinas.length) {
            this.nomeDisciplinas[pos] = nomeDisciplina;
        } else {
            System.err.println("Erro: Posição de disciplina inválida.");
        }
    }

    public void setNotaPosIJ(int posI, int posJ, double nota) { // Nome do método corrigido para setNotaPosIJ
        // Validação básica para evitar ArrayIndexOutOfBoundsException
        if (posI >= 0 && posI < notasDisciplinas.length &&
                posJ >= 0 && posJ < notasDisciplinas[posI].length) {
            this.notasDisciplinas[posI][posJ] = nota;
        } else {
            System.err.println("Erro: Posição de nota inválida.");
        }
    }
}