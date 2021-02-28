package com.latam.arriendos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.latam.arriendos.model.Arriendo;
import com.latam.arriendos.model.Pelicula;
import com.latam.arriendos.repository.ArriendoRepository;
import com.latam.arriendos.repository.PeliculaRepository;

@SpringBootTest
class AsociacionesApplicationTests {
	
	@Autowired
	private ArriendoRepository arriendoRepository;
	
	@Autowired
	PeliculaRepository peliculaRepository;


	@Test
	private void validaRepositoriosCreandoPeliculaYArriendo() {
		//nueva película
		Pelicula spaceOdyssey = new Pelicula(null, "2001: Odisea del Espacio",
				
				"Después de descubrir un misterioso artefacto enterrado" +
				"bajo la superficie lunar, la humanidad emprende una" +
				"búsqueda para encontrar sus orígenes con la ayuda de la supercomputadora inteligente H.A.L. 9000",
				
				149);
		
		//nuevo arriendo
		Arriendo arriendo = new Arriendo(null, "11/20/2019", 7, spaceOdyssey);
		
		//guardar arriendo
		arriendoRepository.save(arriendo);
		
		//buscar arriendo
		Arriendo arriendoOd = arriendoRepository.findById(1).get();
		
		//valida que exista
		Assertions.assertNotNull(arriendoOd);
		
	}

}
