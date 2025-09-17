import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private int codigo;
    private LocalDate data;
    private LocalTime hora;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.codigo = itens.size() + 1;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido i : itens) {
            total += i.getQuantidade() * i.getValorUnitario();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Dados do pedido: ");
        System.out.println("Código: " + this.codigo);
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Itens do pedido: ");

        for (ItemPedido i : itens) {
            System.out.println("Código: " + i.getCodigo());
            System.out.println("Descrição: " + i.getDescricao());
            System.out.println("Valor unitário R$" + i.getValorUnitario());
            System.out.println("Quantidade: " + i.getQuantidade());
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
}
