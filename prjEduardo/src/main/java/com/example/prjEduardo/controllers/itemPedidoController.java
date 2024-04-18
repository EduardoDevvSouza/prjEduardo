package com.example.prjEduardo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjEduardo.entities.itemPedido;
import com.example.prjEduardo.servicies.itemPedidoService;

@RestController
@RequestMapping("/itemPedidos")

public class itemPedidoController {
    private final itemPedidoService itemPedidoService;

    public itemPedidoController(itemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }
    

    @PostMapping
    public itemPedido createProduct(@RequestBody itemPedido itemPedido) {
        return itemPedidoService.saveitemPedido(itemPedido);
    }

    @GetMapping("/{id}")
    public itemPedido getitemPedido(@PathVariable Long id) {
        return itemPedidoService.getitemPedidoById(id);
    }

    @GetMapping
    public List<itemPedido> getAllitemPedidos() {
        return itemPedidoService.getAllitemPedido();
    }
}