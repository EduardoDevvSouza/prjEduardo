package com.example.prjEduardo.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjEduardo.entities.Produto;
import com.example.prjEduardo.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> getAllProduto() {
        return produtoRepository.findAll();
    }
}