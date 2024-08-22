package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estatus {
	@Id
	private int idEstatus;
	private String estatus;
	public int getIdEstatus() {
		return idEstatus;
	}
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
}
