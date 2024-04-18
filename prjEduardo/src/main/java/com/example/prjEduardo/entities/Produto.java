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
@Table(name="produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "categoria", nullable = false, length = 100)
	private String categoria;
	
	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "preco", nullable = false, length = 100)
	private Double preco;
	
	@OneToOne
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedor;
}