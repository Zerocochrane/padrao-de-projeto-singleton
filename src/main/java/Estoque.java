import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque uniqueInstance;

    private String nome;
    private Endereco endereco;
    private List<Produto> produtos = new ArrayList<Produto>();

    private Estoque(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public static synchronized Estoque getInstance(String nome, Endereco endereco) {
        if (uniqueInstance == null)
            uniqueInstance = new Estoque(nome, endereco);

        return uniqueInstance;
    }

    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setProduto(Produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
