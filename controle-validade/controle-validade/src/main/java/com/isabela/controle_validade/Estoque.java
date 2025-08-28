package com.isabela.controle_validade;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public boolean removerProduto(String codigo) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getCodigo().equals(codigo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Produto> getProdutosEmAlerta() {
        List<Produto> produtosEmAlerta = new ArrayList<>();
        LocalDate hoje = LocalDate.now();

        for (Produto p : produtos) {
            long mesesParaVencer = ChronoUnit.MONTHS.between(hoje, p.getDataValidade());
            if (mesesParaVencer <= 6 && mesesParaVencer >= 0) {
                produtosEmAlerta.add(p);
            }
        }
        return produtosEmAlerta;
    }

    public void gerarCSV(String nomeArquivo) throws IOException {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.append("Nome,Código,Lote,DataValidade,Quantidade,Fornecedor\n");

            for (Produto p : produtos) {
                writer.append(p.getNome()).append(",");
                writer.append(p.getCodigo()).append(",");
                writer.append(p.getLote()).append(",");
                writer.append(p.getDataValidade().toString()).append(",");
                writer.append(String.valueOf(p.getQuantidade())).append(",");
                writer.append(p.getFornecedor()).append("\n");
            }
        }
    }
}