package com.project.polimusic.managerImpl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.polimusic.entity.Artistas;
import com.project.polimusic.entity.TipoDocumento;
import com.project.polimusic.manager.ArtistasManager;

public class ArtistaManagerImplTest {
	@Autowired
	ArtistasManager artistaManager;



	@Test
	public void testSaveArtista() {
		try {
			Artistas artistas = new Artistas();
			artistas.setIdArtista(1);
			artistas.setListTipoDocumento(null);
			artistas.setPrimerNombre("Shakira");
			artistas.setSegundoNombre("Isabel");
			artistas.setPrimerApellido("Mebarak");
			artistas.setSegundoApellido("Ripoll​​");
			artistas.setNombreArtistico("Shakira");
			artistas.setListEmpresa(null);
			artistas.setEstado("S");
			artistaManager.saveArtistas(artistas);
		} catch (Exception e) {
			fail("Error al guardar el artista- " + e);
		}
	}

	@Test
	public void testGetArtistaById() {
		try {
			Artistas artista = artistaManager.findArtistasById(1);
			assertNotNull(artista);
		} catch (Exception e) {
			fail("Error al obtener el artista- " + e);
		}
	}

	@Test
	public void testDeleteArtista() {
		try {
			Artistas artistas = new Artistas();
			artistas.setIdArtista(1);
			artistas.setEstado("N");
			artistaManager.deleteArtistasById(1);
		} catch (Exception e) {
			fail("Error al eliminar el artista- " + e);
		}
	}
}
