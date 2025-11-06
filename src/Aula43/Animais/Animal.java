package Aula43.Animais;

public class Animal {

    private String nome;
    private double comprimento;
    private Integer patas;
    private String cor;
    private String ambiente;
    private int velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Entender esse bloco aqui
    @Override
    public String toString(){
        String s = " Nome: " + nome;
        s += "\nComprimento: "+ comprimento+"cm";
        s += "\nPatas: " +patas;
        s += "\nColoração: " + cor;
        s += "\nAmbiente: " + ambiente;
        s += "\nVelocidade: " + velocidade + "m/s";

        return s;

    }

}
