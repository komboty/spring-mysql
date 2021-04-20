package com.example.demo.clientes.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clientes.domain.Cliente;
import com.example.demo.clientes.repositories.ClienteDAO;
import com.example.demo.empresas.domain.Empresa;
import com.example.demo.empresas.repositories.EmpresaDAO;

@Service
public class ClienteService {
	private static Logger LOG = LoggerFactory.getLogger(ClienteService.class);

	@Autowired
	private ClienteDAO clienteDAO;
	
	public List<Cliente> getAll() {
		LOG.debug("getAll()");    
		return (List<Cliente>) clienteDAO.findAll();
	}
}
