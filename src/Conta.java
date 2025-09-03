import java.util.Date;

public class Conta {
    String numero;
    double saldo;
    double limite;
    Date dataAbertura;
    Cliente titular; // composição

    void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor
                    + " realizado com sucesso!");
        }
        else {
            System.out.println("Depósito inválido!");
        }
    }

    void sacar(double valor) {
        double saldoDisponivel = this.saldo + this.limite;

        if (valor <= saldoDisponivel && valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor +
                    " realizado com sucesso!");
        } else if (valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            System.out.println("Saque não permitido!");
        }
    }

    void imprimirExtrato(){
        System.out.println(" ----- EXTRATO DA CONTA -----");
        System.out.println("Número: " + numero);
        System.out.println("Data de abertura: " + dataAbertura);
        System.out.println("Nome do cliente: " +
                titular.nome + " " + titular.sobrenome);
        System.out.println("Saldo: R$" + saldo);
    }
}