package com.example.demo.empresas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.clientes.domain.Cliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "empresas")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "empresa_id")
    private Integer id;
	
	@Column(name = "name")
    private String name;
		
	@OneToMany(mappedBy = "empresa")
	@JsonManagedReference
    private List<Cliente> clientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}