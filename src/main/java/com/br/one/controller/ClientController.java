package com.br.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.one.domain.Client;
import com.br.one.service.ClientService;
import com.br.one.service.CrudService;

@RestController
@RequestMapping("/clients/")
public class ClientController extends CrudController<Client, Long>{

	@Autowired
	private ClientService service;
	
	@Override
	protected CrudService<Client, Long> getService() {
		return service;
	}

}
