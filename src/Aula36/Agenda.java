package Aula36;

public class Agenda {

    private String nome;
    private Contato1[] contatos;

    // Construtor Padrão
    public Agenda(){
    }

    // Construtor com Nome
    public Agenda(String nome) {
        this.nome = nome;
    }


    public String obterInfo () {
        String info = "Nome da Agenda: " + nome + "\n";

        // Verifica se o array de contatos foi inicializado
        if (contatos != null) {
            info += "--- Lista de Contatos ---\n";
            // Itera sobre todos os contatos
            for (Contato1 c : contatos) {

                info += c.obterInfo() + "\n";
            }
        } else {
            info += "A agenda não possui contatos cadastrados.\n";
        }

        return info;
    }

    // Getters e Setters
    public Contato1[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato1[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}