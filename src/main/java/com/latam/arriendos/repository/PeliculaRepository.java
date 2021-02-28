package com.latam.arriendos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latam.arriendos.model.Pelicula;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer>{

}
