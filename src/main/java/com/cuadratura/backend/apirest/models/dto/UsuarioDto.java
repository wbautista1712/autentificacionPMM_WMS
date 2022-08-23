package com.cuadratura.backend.apirest.models.dto;

import java.io.Serializable;

public class UsuarioDto implements Serializable{
	
	private Long id;
	private String username;
	private Boolean enabled;
	private String nombre;
	private String apellido;
	private String email;
	
	
	public UsuarioDto()
	{}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private static final long serialVersionUID = 1L;
}
