package com.br.demo.dto.response;

public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private double preco;

    public ProdutoResponseDTO(){}

    public ProdutoResponseDTO(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
