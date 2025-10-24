public class Gato extends Animal {
    String nome;
    int idade;
    String raca;
    char genero;
    char tamanho;
    String cor;

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    void comer(String comida) {
        System.out.println("O gato " + nome + " está comendo " + comida);
    }

    String dormir() {
        return "O gato está dormindo zzzzz";
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau!");
    }
}