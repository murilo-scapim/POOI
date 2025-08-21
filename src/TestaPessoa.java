public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Matheus";
        pessoa.altura = 1.98;
        pessoa.peso = 80.0;

        double imc = pessoa.peso /
                (Math.pow(pessoa.altura, 2));

        System.out.println("O peso do " + pessoa.nome +
                " é " + pessoa.peso + " kg e seu imc é " +
                imc);
    }
}
