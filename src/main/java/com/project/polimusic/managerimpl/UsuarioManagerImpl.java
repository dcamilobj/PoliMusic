/**
 * 
 */
package com.project.polimusic.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.polimusic.entity.Usuario;
import com.project.polimusic.manager.UsuarioManager;
import com.project.polimusic.repository.LogAuditoriaRepository;
import com.project.polimusic.repository.UsuarioRepository;

/**
 * @author grupoMultidisciplinario
 *
 */
@Service
public class UsuarioManagerImpl implements UsuarioManager {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuarioById(long id) {
		return usuarioRepository.findById(id).get();
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void deleteUsuario(Usuario usuario) {
		usuarioRepository.delete(usuario);
		
	}


	
}
