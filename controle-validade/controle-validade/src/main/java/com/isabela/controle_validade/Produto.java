package com.isabela.controle_validade;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private String codigo;
    private LocalDate dataValidade;
    private String lote;
    private int quantidade;
    private String fornecedor;

    public Produto(String nome, String codigo, LocalDate dataValidade, String lote, int quantidade, String fornecedor) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataValidade = dataValidade;
        this.lote = lote;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }
}