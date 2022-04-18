public class Produto {

    private String nome;
    private String preco;
    private String descricao;

    public String getNome() {
        return nome;
    }
    public String getPreco() {
        return preco;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
