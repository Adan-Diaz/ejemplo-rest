package edu.ieu.ejemplorest.servicios;

import java.util.List;

import edu.ieu.ejemplorest.entities.Usuario;

public interface UsuarioService {
	//consulta SELECT 
	Usuario findById(long id);
    Usuario findByNombre(String name);
    List<Usuario> findAll(); 
    boolean isUserExist(Usuario user);
    //CREAR 
    void saveUser(Usuario user);
     //Actualizar
    void updateUser(Usuario user);
    //Borrar
    void deleteUserById(long id);

}
