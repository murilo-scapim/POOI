public abstract class Animal {
    protected String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // método abstrato
    public abstract void emitirSom();
}