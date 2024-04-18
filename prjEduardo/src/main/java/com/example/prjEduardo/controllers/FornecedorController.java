package com.example.prjEduardo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjEduardo.entities.Fornecedor;
import com.example.prjEduardo.servicies.FornecedorService;

@RestController
@RequestMapping("/fornecedors")

public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }
    

    @PostMapping
    public Fornecedor createProduct(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.saveFornecedor(fornecedor);
    }

    @GetMapping("/{id}")
    public Fornecedor getFornecedor(@PathVariable Long id) {
        return fornecedorService.getFornecedorById(id);
    }

    @GetMapping
    public List<Fornecedor> getAllFornecedors() {
        return fornecedorService.getAllFornecedor();
    }
}