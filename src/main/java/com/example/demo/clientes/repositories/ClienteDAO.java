package com.example.demo.clientes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.clientes.domain.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Long>{

}
