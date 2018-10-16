package com.project.polimusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.polimusic.entity.Artistas;
import com.project.polimusic.manager.ArtistasManager;


public class ArtistaController {
	 @Autowired
	    private ArtistasManager artistasManager;

	    @RequestMapping(method = RequestMethod.GET, value = "/{idArtistas}")
	    public Artistas findArtistaById(@PathVariable Integer idArtistas) {
	        return artistasManager.findArtistasById(idArtistas);
	    }

	    @RequestMapping(method = RequestMethod.GET)
	    public List<Artistas> findArtistas() {
	        return artistasManager.findArtistas();
	    }

	    @RequestMapping(method = RequestMethod.DELETE, value = "/{idArtistas}")
	    public void deleteArtistasById(@PathVariable Integer idArtistas) {
	    	artistasManager.deleteArtistasById(idArtistas);
	    }

	    @RequestMapping(method = RequestMethod.POST, value = "/controlarchivos")
	    public Artistas saveArtistas(@RequestBody Artistas Artistas) {
	        return artistasManager.saveArtistas(Artistas);
	    }

	    @RequestMapping(method = RequestMethod.PUT, value = "/{idArtistas}")
	    public Artistas updateArtistas(@PathVariable Integer idArtistas, @RequestBody Artistas Artistas) {
	        return artistasManager.updateArtistas(idArtistas, Artistas);
	    }

}
