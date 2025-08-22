public class TestaCarro {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Hyago";
        proprietario.cpf = "556.789.234-8";
        proprietario.idade = 22;
        proprietario.logradouro = "Rua Indalescio de Souza Melo, 200";
        proprietario.bairro = "Santa Cruz";
        proprietario.cidade = "Ipuã";
        proprietario.estado = "São Paulo";

        Carro carro = new Carro(); // instânciação
        carro.fabricante = "Volkswagen";
        carro.modelo = "Gol";
        carro.cor = "Amarelo";
        carro.tipoCombustivel = "Gasolina";
        carro.anoFabricacao = 2000;
        carro.valorMercado = 10000;
        carro.proprietario = proprietario;

        System.out.println("Fabricante: " + carro.fabricante);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Tipo do combustível: " + carro.tipoCombustivel);
        System.out.println("Ano de fabricação: " + carro.anoFabricacao);
        System.out.println("Valor de mercado: R$" + carro.valorMercado);
        System.out.println("Proprietário: " + carro.proprietario.nome);
    }
}
