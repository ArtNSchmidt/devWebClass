package com.br.demo.dto.request;

public class ProdutoRequestDTO {
    private String nome;
    private double preco;
    private String numeroSerie;

    public ProdutoRequestDTO(String nome, double preco, String numeroSerie) {
        this.nome = nome;
        this.preco = preco;
        this.numeroSerie = numeroSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
