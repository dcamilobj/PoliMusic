package com.project.polimusic.manager;

import java.util.List;

import com.project.polimusic.entity.Artistas;

public interface ArtistasManager {
	
	    Artistas findArtistasById(Integer idArtistas);

	    List<Artistas> findArtistas();

	    void deleteArtistasById(Integer idArtistas);

	    Artistas saveArtistas(Artistas Artistas);

	    Artistas updateArtistas(Integer idArtistas, Artistas Artistas);

}
