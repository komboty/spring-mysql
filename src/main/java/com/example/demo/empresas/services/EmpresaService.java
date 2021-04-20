package com.example.demo.empresas.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empresas.domain.Empresa;
import com.example.demo.empresas.repositories.EmpresaDAO;

@Service
public class EmpresaService {
	private static Logger LOG = LoggerFactory.getLogger(EmpresaService.class);

	@Autowired
	private EmpresaDAO empresaDAO;
	
	public List<Empresa> getAll() {
		LOG.debug("getAll()");    
		return (List<Empresa>) empresaDAO.findAll();
	}
}
