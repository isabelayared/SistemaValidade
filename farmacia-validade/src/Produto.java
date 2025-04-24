import java.time.LocalDate;

public class Produto {
    private String nome;
    private String codigoBarras;
    private String lote;
    private LocalDate validade;

    public Produto(String nome, String codigoBarras, String lote, LocalDate validade) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.lote = lote;
        this.validade = validade;
    }

    public String getNome() { return nome; }
    public String getCodigoBarras() { return codigoBarras; }
    public String getLote() { return lote; }
    public LocalDate getValidade() { return validade; }

    // Exemplo de exibição
    public String toString() {
        return nome + " | Lote: " + lote + " | Val: " + validade;
    }
}
