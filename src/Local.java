 public class Local {
    private String endereco;
    private String nome;

    public Local(String endereco, String nome) {
        setEndereco(endereco);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
