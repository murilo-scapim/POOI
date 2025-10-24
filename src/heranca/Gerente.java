package heranca;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf,
                   double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        return this.salario * 0.15;
    }
}
