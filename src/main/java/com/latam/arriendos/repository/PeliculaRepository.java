package com.latam.arriendos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latam.arriendos.model.Pelicula;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer>{
	// Primero la clase sobre la que trabajaremos "Pelicula"
	// y luego el identificador "Integer" (que debe coincidir con el tipo de dato de la id de cliente)

}
