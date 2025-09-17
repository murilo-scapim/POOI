public class TestaPedido {
    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido();
        item1.setCodigo(2);
        item1.setDescricao("Suco de laranja");
        item1.setValorUnitario(10.0);
        item1.setQuantidade(2);

        ItemPedido item2 = new ItemPedido();
        item2.setCodigo(3);
        item2.setDescricao("Pizza de calabresa");
        item2.setValorUnitario(80.0);
        item2.setQuantidade(2);

        Pedido p = new Pedido();
        p.adicionarItem(item1);
        p.adicionarItem(item2);

        p.exibirPedido();

        p.removerItemPorDescricao("Suco de laranja");

        p.exibirPedido();
    }
}
