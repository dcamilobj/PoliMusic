/**
 * 
 */
package com.project.polimusic.controlusuario.manager;

import java.util.List;

import com.project.polimusic.controlusuario.entity.Perfil;

/**
 * @author grupoMultidisciplinario
 *
 */
public interface PerfilManager {

	public List<Perfil> getAllPerfiles();
	
	public Perfil getPerfilById(long id);
	
	public void savePerfil(Perfil perfil);
	
	public void deletePerfil(Perfil perfil);
}
