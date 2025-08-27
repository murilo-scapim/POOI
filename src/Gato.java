public class Gato {
    String nome;
    int idade;
    String raca;
    char genero;
    char tamanho;
    String cor;

    void miar(){
        System.out.println("Miau miau...");
    }

    void comer(String comida){
        System.out.println("O gato " + nome + " está comendo " + comida);
    }

    String dormir(){
        return "O gato está dormindo zzzzz";
    }
}
