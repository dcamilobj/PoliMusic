/**
 * 
 */
package com.project.polimusic.controlusuario.managerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.polimusic.controlusuario.entity.Perfil;
import com.project.polimusic.controlusuario.manager.PerfilManager;
import com.project.polimusic.controlusuario.repository.PerfilRepository;

/**
 * @author grupoMultidisciplinario
 *
 */
public class PerfilManagerImpl implements PerfilManager{
	
	@Autowired
	PerfilRepository perfilRepository;

	@Override
	public List<Perfil> getAllPerfiles() {
		return perfilRepository.findAll();
	}

	@Override
	public Perfil getPerfilById(long id) {
		return perfilRepository.findById(id).get();
	}

	@Override
	public void savePerfil(Perfil perfil) {
		 perfilRepository.save(perfil);
	}

	@Override
	public void deletePerfil(Perfil perfil) {
		perfilRepository.delete(perfil);
	}
	
}
