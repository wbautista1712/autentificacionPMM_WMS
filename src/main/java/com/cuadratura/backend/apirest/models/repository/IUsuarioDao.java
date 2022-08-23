package com.cuadratura.backend.apirest.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cuadratura.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
	/*
	@Query("select u from usuarios u where u.username=?1")
	public Usuario findByUsername2(String username);
	*/

	/*
	 @Query("select p from usuarios p where p.nombre like %?1%") 
	 public List<Usuario> findByName(String nombre);
	 */
	 
	 @Query("select u from Usuario u where concat(u.nombre,' ', u.username) like %?1%")
	 //@Query("select u.username, u.enabled, u.nombre, u.apellido, u.email from Usuario u where concat(u.nombre,' ', u.username) like %?1%")
	 public List<Usuario> findByNameOrLastNameContainingIgnoreCase(String nombreUsername);
	 
}
