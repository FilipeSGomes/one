package com.br.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.one.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
