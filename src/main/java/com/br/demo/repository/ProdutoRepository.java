package com.br.demo.repository;

import com.br.demo.model.Produto;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoRepository {
    private final List<Produto> produtos = new ArrayList<>();
    private Long nextId = 1L;

    public List<Produto> findall(){
        return produtos;
    }
    public Optional<Produto> finById(Long id){
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
