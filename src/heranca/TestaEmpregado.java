package heranca;

public class TestaEmpregado {
    public static void main(String[] args) {

        Empregado e = new Assalariado("Hyago", "Santos","955-228-840-05", 5000);
        System.out.println("Nome: " + e.getNome() + " " + e.getSobrenome());
        System.out.println("CPF: " + e.getCpf());
        System.out.println("O vencimento é R$" + e.vencimento());
    }
}
