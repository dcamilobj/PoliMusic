/**
 * 
 */
package com.project.polimusic.controlusuario.manager;

import java.util.List;

import com.project.polimusic.controlusuario.entity.Usuario;


/**
 * @author grupoMultidisciplinario
 *
 */
public interface UsuarioManager {

	public List<Usuario> getAllUsuarios();
	
	public Usuario getUsuarioById(long id);
	
	public void saveUsuario(Usuario usuario);
	
	public void deleteUsuario(Usuario usuario);
}
