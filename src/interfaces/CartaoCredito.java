package interfaces;

public class CartaoCredito implements Pagamento {
    private String nomeTitular;

    public CartaoCredito(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor
                + "cartão de crédito");
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}
