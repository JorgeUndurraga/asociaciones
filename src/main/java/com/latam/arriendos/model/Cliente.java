package com.latam.arriendos.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="SQ_CLIENTE", initialValue=1, allocationSize=1)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SQ_CLIENTE")
	private Integer id;
	private String nombre;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "cliente")
	private List<Arriendo> arriendos;
	

}
