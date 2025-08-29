import java.util.Date;

public class TestaConta {
    public static void main(String[] args) {
        Cliente titular = new Cliente();
        titular.nome = "Hyago";
        titular.sobrenome = "Santos";
        titular.cpf = "123.456.789-01";

        Conta conta = new Conta();
        conta.numero = "111.222-000";
        conta.saldo = 0;
        conta.limite = 5000;
        conta.dataAbertura = new Date();
        conta.titular = titular;

        conta.depositar(1000);
        conta.imprimirExtrato();
        conta.sacar(500);
        conta.imprimirExtrato();
    }
}
