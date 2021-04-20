package com.example.demo.empresas.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.empresas.domain.Empresa;
import com.example.demo.empresas.services.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	private static Logger LOG = LoggerFactory.getLogger(EmpresaController.class);

	@Autowired
	private EmpresaService empresaService;

	@GetMapping("/all")
	public List<Empresa> findAll() {
		LOG.debug("findAll()"); 
		return empresaService.getAll();
	}
}
