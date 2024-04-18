package com.example.prjEduardo.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjEduardo.entities.Fornecedor;
import com.example.prjEduardo.repositories.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor getFornecedorById(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> getAllFornecedor() {
        return fornecedorRepository.findAll();
    }
}