public class TestaComputador {
    public static void main(String[] args) {

        Computador computador = new Computador();
        computador.setMarca("Dell");
        computador.setModelo("Inspiron");
        computador.setCor("Preto");
        computador.setMemoria(16);
        computador.setArmazenamento(512);
        computador.setSistemaOperacional("Windows");

        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());
        computador.ligar();
        computador.executarTarefa("Abrir firefox");
        computador.desligar();
    }
}
