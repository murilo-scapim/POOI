public class TestaAutor {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Gabriel");
        autor.setEmail("gabriel@sou.fafram.com.br");
        autor.setCpf("123.456.789-0");

        System.out.println("Autor: " + autor.getNome());
        System.out.println("Email: " + autor.getEmail());
        System.out.println("CPF: " + autor.getCpf());
    }
}
