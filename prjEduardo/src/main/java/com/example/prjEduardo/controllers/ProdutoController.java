package com.example.prjEduardo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjEduardo.entities.Produto;
import com.example.prjEduardo.servicies.ProdutoService;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    

    @PostMapping
    public Produto createProduct(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProduto();
    }
}