import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Imc de " + nome + ": " + imc);
    }
}
