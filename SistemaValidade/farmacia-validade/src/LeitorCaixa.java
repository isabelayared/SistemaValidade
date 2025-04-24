import java.util.Scanner;

public class LeitorCaixa {

    public static void simularCaixa(Estoque estoque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSimulação do Caixa - Bipar Produto");

        while (true) {
            System.out.print("Digite o código de barras do produto vendido (ou 'sair'): ");
            String codigo = scanner.nextLine();

            if (codigo.equalsIgnoreCase("sair")) break;

            estoque.removerProdutoPorCodigo(codigo);
        }
    }
}
