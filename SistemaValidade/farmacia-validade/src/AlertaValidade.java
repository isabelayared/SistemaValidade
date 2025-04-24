import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AlertaValidade {

    public static void verificarProdutosProximos(Estoque estoque) {
        System.out.println("\n⚠️ Produtos próximos da validade:");

        for (Produto p : estoque.getProdutos()) {
            long mesesRestantes = ChronoUnit.MONTHS.between(LocalDate.now(), p.getValidade());

            if (mesesRestantes <= 6 && mesesRestantes >= 0) {
                System.out.println("-> " + p + " | Vence em " + mesesRestantes + " mês(es)");
            }
        }
    }
}

