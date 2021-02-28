package com.latam.arriendos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latam.arriendos.model.Arriendo;

@Repository
public interface ArriendoRepository extends CrudRepository<Arriendo, Integer> {

}
