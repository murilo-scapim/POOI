package heranca;

public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome,
                   String cpf, double precoHora,
                   double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public double vencimento() {
        return horasTrabalhadas * precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
}
