package com.br.one.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.br.one.domain.Client;
import com.br.one.repository.ClientRepository;
import com.br.one.service.ClientService;
@Service
public class ClientServiceImpl extends CrudServiceImpl<Client, Long> implements ClientService {

	@Autowired 
	private ClientRepository repository;
	
	@Override
	protected JpaRepository<Client, Long> getData() {
		return repository;
	}

	
	
	
}
