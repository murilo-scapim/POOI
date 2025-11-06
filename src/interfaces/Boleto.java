package interfaces;

public class Boleto implements Pagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$"+
                valor + " com o boleto");
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
}
