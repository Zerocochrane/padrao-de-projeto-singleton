import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class EstoqueTest {
    @Test
    public void test(){

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Aqui");
        endereco.setNumero("420");
        endereco.setComplemento("Casa");
        endereco.setBairro("Centro");
        endereco.setPais("Rio de Janeiro");

        Produto produto1 = new Produto();
        produto1.setNome("Carro");
        produto1.setPreco("30000");
        produto1.setDescricao("Veiculo automotivo de quatro rodas");

        Produto produto2 = new Produto();
        produto2.setNome("iPhone");
        produto2.setPreco("3000");
        produto2.setDescricao("Smartphone");



        Estoque estoque1 =  Estoque.getInstance("Da Esquina", endereco);
        estoque1.setProduto(produto1);
        estoque1.setProduto(produto2);


        Estoque estoque2 =  Estoque.getInstance("Da Esquina", endereco);


        assertEquals(estoque1.getProdutos().get(1).getNome(), "iPhone");
        assertEquals(estoque2.getProdutos().get(1).getNome(), "iPhone");
    }

}