package edu.ieu.ejemplorest.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.ieu.ejemplorest.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	@Query("SELECT user FROM Usuario user WHERE user.nombre = ?1  ")
	public Usuario findByNombre(String nombre);
}
