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
@Table(name="itempedido")
public class itemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "quantidade", nullable = false, length = 100)
	private String quantidade;
	
	@Column(name = "valor_unitário", nullable = false, length = 100)
	private String valor_unitário;
	
	@OneToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
}