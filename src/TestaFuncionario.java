public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Hyago";
        funcionario.sobrenome = "Santos";
        funcionario.horasDeTrabalho = 16;
        funcionario.valorPorHora = 45.0;

        System.out.println("Nome completo: " + funcionario.nomeCompleto());
        System.out.println("Valor mensal R$" + funcionario.valorMensal());
        funcionario.incrementarValorPorHora(5.0);

        System.out.println(funcionario.valorPorHora);
    }
}
