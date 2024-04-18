package com.example.prjEduardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prjEduardo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}