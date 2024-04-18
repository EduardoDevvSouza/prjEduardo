package com.example.prjEduardo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data_pedido", nullable = false, length = 100)
	private String data_pedido;
	
	@Column(name = "valor_total", nullable = false, length = 100)
	private String valor_total;
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
}