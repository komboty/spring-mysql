package com.example.demo.empresas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.empresas.domain.Empresa;

public interface EmpresaDAO extends CrudRepository<Empresa, Long>{

}
