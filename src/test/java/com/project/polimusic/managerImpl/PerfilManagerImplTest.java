package com.project.polimusic.managerImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.project.polimusic.entity.Perfil;
import com.project.polimusic.manager.PerfilManager;



public class PerfilManagerImplTest {

	@Autowired
	PerfilManager perfilManager;
	
	
	@Test
	public void testGetAllPerfiles() {
		try{
			List<Perfil> perfiles = perfilManager.getAllPerfiles();
			System.out.println(perfiles.size());
		}catch(Exception e){
			fail("Error al obtener perfiles- " + e);
		}
		
		
	}
	
	@Test
	public void testSavePerfil() {
		try{
			Perfil perfil = new Perfil();
			perfil.setIdPerfil(1L);
			perfil.setNombrePerfil("Administrador");
			perfilManager.savePerfil(perfil);
		} catch(Exception e){
			fail("Error al guardar perfil- " + e);
		}
	}

	@Test
	public void testGetPerfilById() {
		try{
			Perfil perfil = perfilManager.getPerfilById(1L);
			assertNotNull(perfil);
		} catch(Exception e){
			fail("Error al obtener perfil- " + e);
		}
	}

	@Test
	public void testDeletePerfil() {
		try{
			Perfil perfil = new Perfil();
			perfil.setIdPerfil(1L);
			perfil.setNombrePerfil("Administrador");
			perfilManager.deletePerfil(perfil);
		} catch(Exception e){
			fail("Error al eliminar el perfil- " + e);
		}
	}

}
