package com.latam.arriendos.repository;

import org.springframework.data.repository.CrudRepository;

import com.latam.arriendos.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
