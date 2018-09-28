/**
 * 
 */
package com.project.polimusic.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.polimusic.entity.Perfil;
import com.project.polimusic.manager.PerfilManager;
import com.project.polimusic.repository.PerfilRepository;

/**
 * @author grupoMultidisciplinario
 *
 */
@Service
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
