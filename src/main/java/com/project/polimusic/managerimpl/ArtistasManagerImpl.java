/**
 * 
 */
package com.project.polimusic.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.polimusic.entity.Artistas;
import com.project.polimusic.manager.ArtistasManager;
import com.project.polimusic.repository.ArtistasRepository;

/**
 * @author eliana.vargas
 *
 */
@Service
public  class ArtistasManagerImpl implements ArtistasManager {

	@Autowired
	private ArtistasRepository artistasRepository;

	

	@Override
	public List<Artistas> findArtistas() {
		// TODO Auto-generated method stub
		return artistasRepository.findAll();
	}

	@Override
	public void deleteArtistasById(Integer idArtistas) {
		// TODO Auto-generated method stub
		Artistas artista = new Artistas();
		artista.setIdArtista(idArtistas);
		artistasRepository.delete(artista);

	}

	@Override
	public Artistas saveArtistas(Artistas Artistas) {
		// TODO Auto-generated method stub
		return artistasRepository.save(Artistas);
	}

	@Override
	public Artistas updateArtistas(Integer idArtistas, Artistas artistas) {

		Artistas artistasToUpdate = artistasRepository.getOne(idArtistas);
		artistasToUpdate.setPrimerNombre(artistas.getPrimerNombre());
		artistasToUpdate.setSegundoNombre(artistas.getSegundoNombre());
		artistasToUpdate.setPrimerApellido(artistas.getPrimerApellido());
		artistasToUpdate.setSegundoApellido(artistas.getSegundoApellido());
		artistasToUpdate.setEstado(artistas.getEstado());
		return artistasRepository.save(artistasToUpdate);
	}

	@Override
	public Artistas findArtistasById(Integer idArtistas) {
		// TODO Auto-generated method stub
		return artistasRepository.findById(idArtistas).get();
	}

}
