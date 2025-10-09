package Aula41ClasseAbstrata;
// Conceito de classe abstrata apenas podemos definir e
// e não podemos tornar realidade a classe ou o método, a classe não
//pode ser instanciada

    public abstract class AbstractPessoa {
        private String nome;
        private String endereco;
        private String telefone;
        private String cpf;
        private String telefoneCelular;

        public AbstractPessoa() {
            
        }

        public AbstractPessoa(String nome, String endereco, String telefone, String cpf) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.cpf = cpf;

        }


        public AbstractPessoa(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
        }

        abstract public void imprimirTelefoneCelular();



        public void imprimirCPF(){
            System.out.println("Cpf: "+ getCpf());
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTelefoneCelular() {
            return telefoneCelular;
        }

        public void setTelefoneCelular(String telefoneCelular) {
            this.telefoneCelular = telefoneCelular;
        }

        public String obterEtiquetaEndereco(){

            return endereco;
        }

    }
