package com.example.prjEduardo.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prjEduardo.entities.Pedido;
import com.example.prjEduardo.repositories.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido getPedidoById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> getAllPedido() {
        return pedidoRepository.findAll();
    }
}