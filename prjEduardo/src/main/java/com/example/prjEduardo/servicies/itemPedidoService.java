package com.example.prjEduardo.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjEduardo.entities.itemPedido;
import com.example.prjEduardo.repositories.itemPedidoRepository;

@Service
public class itemPedidoService {
    private final itemPedidoRepository itemPedidoRepository;

    public itemPedidoService(itemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public itemPedido saveitemPedido(itemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public itemPedido getitemPedidoById(Long id) {
        return itemPedidoRepository.findById(id).orElse(null);
    }

    public List<itemPedido> getAllitemPedido() {
        return itemPedidoRepository.findAll();
    }
}