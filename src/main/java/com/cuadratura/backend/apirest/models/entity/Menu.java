package com.cuadratura.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.ManyToMany;

public class Menu implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long idMenu;
	private String nombreMenu;
	private String urlImagen;
	private Boolean estado;
	
	@ManyToMany(targetEntity=Role.class)
	//private Set clasSet;
	
	public Long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	public String getNombreMenu() {
		return nombreMenu;
	}
	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
