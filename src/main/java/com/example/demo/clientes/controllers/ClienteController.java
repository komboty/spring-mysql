package com.example.demo.clientes.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clientes.domain.Cliente;
import com.example.demo.clientes.services.ClienteService;
import com.example.demo.empresas.domain.Empresa;
import com.example.demo.empresas.services.EmpresaService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	private static Logger LOG = LoggerFactory.getLogger(ClienteController.class);

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/all")
	public List<Cliente> findAll() {
		LOG.debug("findAll()"); 
		return clienteService.getAll();
	}
}
