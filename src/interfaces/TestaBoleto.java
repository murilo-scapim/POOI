package interfaces;

public class TestaBoleto {
    public static void main(String[] args) {

        Boleto boleto = new Boleto("001 9 0500 9 5 4014481606 90680935031 4 3 3737 0000000100");
        boleto.pagar(150.00);
        CartaoCredito cartao = new CartaoCredito("Igor");

        Pagamento p = new CartaoCredito("Igor");
    }
}