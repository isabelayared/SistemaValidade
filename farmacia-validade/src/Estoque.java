import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Adiciona produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque: " + produto);
    }

    // Remove produto do estoque (simulação de venda)
    public boolean removerProdutoPorCodigo(String codigoBarras) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto p = iterator.next();
            if (p.getCodigoBarras().equals(codigoBarras)) {
                iterator.remove();
                System.out.println("Produto vendido e removido: " + p);
                return true;
            }
        }
        System.out.println("Produto com código " + codigoBarras + " não encontrado.");
        return false;
    }

    // Exibe todos os produtos
    public void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
        } else {
            System.out.println("\nProdutos em estoque:");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    // Retorna lista de produtos (usado para gerar alertas depois)
    public List<Produto> getProdutos() {
        return produtos;
    }
}

