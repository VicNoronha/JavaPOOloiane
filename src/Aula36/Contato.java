package Aula36;

// A classe Endereco e Telefone devem estar definidas no projeto.

public class Contato {

    private String nome;
    private Endereco endereco;    // Endereço (objeto)
    private Telefone[] telefones;


    public Contato() {
        // Corrigido: Não precisa mais inicializar o campo 'endereco' (objeto) como nulo,
        // mas pode fazer se quiser.
    }

    // ---------------------- Getters e Setters ----------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    // Corrigido: Setter funcionando corretamente para o atributo Endereco (objeto).
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public String obterInfo() {
        return null;
    }
}