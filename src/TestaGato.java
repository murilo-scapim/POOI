public class TestaGato {
    public static void main(String[] args) {
        Gato gato = new Gato("Cheddar", 5);
        // gato.nome = "Cheddar";
        // gato.idade = 5;
        gato.raca = "Persa";
        gato.genero = 'M';
        gato.tamanho = 'M';
        gato.cor = "Laranja";

        System.out.println(gato.nome);
        System.out.println(gato.idade);
        System.out.println(gato.raca);
        System.out.println(gato.genero);
        System.out.println(gato.tamanho);
        System.out.println(gato.cor);

        gato.comer("Ração");
        System.out.println(gato.dormir());
    }
}
