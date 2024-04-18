package com.example.prjEduardo.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjEduardo.entities.Cliente;
import com.example.prjEduardo.repositories.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }
}