public class Computador {
    private String marca;
    private String modelo;
    private String cor;
    private double memoria;
    private double armazenamento;
    private String sistemaOperacional;

    Computador() {}

    Computador(String marca, String modelo) {
        this();
        System.out.println("Construindo o objeto");
        this.marca = marca;
        this.modelo = modelo;
    }

    Computador(String marca, String modelo, String cor){
        this(marca, modelo);
        this.cor = cor;

    }

    void ligar() {
        System.out.println("Computador ligado");
    }

    void executarTarefa(String tarefa) {
        System.out.println("Executando " + tarefa);
    }

    void desligar() {
        System.out.println("Computador desligado");
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
