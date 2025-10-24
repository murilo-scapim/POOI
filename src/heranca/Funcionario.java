package heranca;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;

   public Funcionario(String nome, String cpf,
                      double salario) {
       this.nome = nome;
       this.cpf = cpf;
       this.salario = salario;
   }

   public double calcularBonificacao() {
       return this.salario * 0.10;
   }
}
