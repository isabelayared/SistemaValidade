import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Adicionando produtos
        estoque.adicionarProduto(new Produto("Dipirona", "123", "L001", LocalDate.of(2025, 5, 20)));
        estoque.adicionarProduto(new Produto("Paracetamol", "124", "L002", LocalDate.of(2025, 9, 1)));
        estoque.adicionarProduto(new Produto("Ibuprofeno", "125", "L003", LocalDate.of(2025, 11, 1)));

        estoque.exibirProdutos();

        // Verifica alertas
        AlertaValidade.verificarProdutosProximos(estoque);

        // Simula venda
        LeitorCaixa.simularCaixa(estoque);

        // Exibe produtos restantes
        estoque.exibirProdutos();
    }
}
