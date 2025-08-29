public class TestaAeronave {
    public static void main(String[] args) {

        Aeronave aeronave = new Aeronave();
        aeronave.totalDeAssentos = 340;
        aeronave.assentosReservados = 0;
        System.out.println("Total de assentos: "
                + aeronave.totalDeAssentos);
        System.out.println("Assentos reservados: "
                + aeronave.assentosReservados);

        aeronave.reservarAssentos(10);
        aeronave.reservarAssentos(1);

        int assentosDisponiveis = aeronave
                .calcularAssentosDisponiveis();
        System.out.println("Assentos disponíveis: " +
                assentosDisponiveis);

        System.out.println("Assentos reservados: "
                + aeronave.assentosReservados);
    }
}
