public class Funcionario {
    // atributos
    String nome;
    String sobrenome;
    double horasDeTrabalho;
    double valorPorHora;

    // métodos
    String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    double valorMensal() {
        return horasDeTrabalho * valorPorHora;
    }

    void incrementarValorPorHora(double valorPorHora) {
        this.valorPorHora += valorPorHora;
    }
}
