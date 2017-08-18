package com.indracompany.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TB_CLIENTE")
public class Cliente {
	
	@Id
	private Long ID_CLIENTE;
	private String NO_CLIENTE;
	
	public Cliente() {
		
	}
	
	public Cliente(Long iD, String nome) {
		super();
		this.ID_CLIENTE = iD;
		this.NO_CLIENTE = nome;
		
	}

	public Long getID_CLIENTE() {
		return ID_CLIENTE;
	}
	
	public String getNO_CLIENTE(){
		return  NO_CLIENTE;
	}
	

}
