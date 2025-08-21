public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(); // instância de um produto
        produto.nome = "Leite";
        produto.preco = 7.99;
        produto.quantidade = 10;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);

        Produto produto2 = new Produto();
        produto2.nome = "Maça do amor";
        produto2.preco = 0.99;
        produto2.quantidade = 15;

        Produto produto3 = new Produto();
        produto3.nome = "Água";
        produto3.preco = 1.99;
        produto3.quantidade = 20;

        double estoqueLeite = produto.preco * produto.quantidade;
        double estoqueMaca = produto2.preco * produto2.quantidade;
        double estoqueAgua = produto3.preco * produto3.quantidade;

        double estoqueTotal = estoqueLeite + estoqueMaca + estoqueAgua;
        System.out.println("O estoque total é R$: " + estoqueTotal);
    }
}
