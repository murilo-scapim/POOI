import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {
    private int codigo;
    private LocalDate data;
    private LocalTime hora;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.codigo = itens.size() + 1;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
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
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("\n---- DADOS DO PEDIDO ----\n");
        System.out.println("Código: " + codigo);
        System.out.println("Data: " + data.format(formatoData));
        System.out.println("Hora: " + hora.format(formatoHora));
        System.out.println("Valor total R$" + calcularValorTotal());

        System.out.println("\nITEMS DO PEDIDO");
        for (ItemPedido i : itens) {
            System.out.println("\nCódigo: " + i.getCodigo());
            System.out.println("Descrição: " + i.getDescricao());
            System.out.println("Valor unitário R$" + i.getValorUnitario());
            System.out.println("Quantidade: " + i.getQuantidade());
        }
    }

    public void removerItemPorDescricao(String descricao) {
        boolean removido = itens.removeIf(i -> i.getDescricao()
                .equalsIgnoreCase(descricao));

        if (removido) {
            System.out.println("\nItem removido com sucesso!");
        } else {
            System.out.println("\nItem não removido!");
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
