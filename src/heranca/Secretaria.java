package heranca;

public class Secretaria extends Funcionario {
    private String ramal;

    public Secretaria(String nome, String cpf,
                      double salario, String ramal) {
        super(nome, cpf, salario);
        this.ramal = ramal;
    }
}
