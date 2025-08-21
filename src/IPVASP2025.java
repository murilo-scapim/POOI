import java.util.Scanner;

public class IPVASP2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a placa do veículo");
        String placa = scanner.nextLine().trim().toUpperCase();

        if(!placa.matches("^[A-Z]{3}-?[0-9]{4}$|^[A-Z]{3}[0-9][A-Z][0-9]{2}$")){
            System.out.println("Placa inválida!");
            scanner.close();
            return;
        }

        char digito = placa.charAt(placa.length() - 1);
        String dataPagamento = ""; // camelCase

        switch (digito){
            case '1':
                dataPagamento = "13/01/2025";
                break;
            case '2':
                dataPagamento = "14/01/2025";
                break;
            default:
                System.out.println("Final da placa inválido");
                return;
        }
        System.out.println("Data do pagamento: " + dataPagamento);
    }
}
