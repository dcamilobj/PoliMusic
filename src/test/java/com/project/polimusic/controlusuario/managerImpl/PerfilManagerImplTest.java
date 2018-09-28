package com.project.polimusic.controlusuario.managerImpl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.project.polimusic.controlusuario.entity.Perfil;
import com.project.polimusic.controlusuario.manager.PerfilManager;

public class PerfilManagerImplTest {

	@Autowired
	PerfilManager perfilManager;
	
	
	@Test
	public void testGetAllPerfiles() {
		try{
			perfilManager.getAllPerfiles();
		}catch(Exception e){
			fail("Not yet implemented - " + e);
		}
		
		
	}

	@Test
	@Rollback(false)
	public void testGetPerfilById() {
		try{
			Perfil perfil = new Perfil();
			perfil.setIdPerfil(1L);
			perfil.setNombrePerfil("Administrador");
			perfilManager.savePerfil(perfil);
		} catch(Exception e){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSavePerfil() {
		try{
			
		} catch(Exception e){
			fail("Not yet implemented");
		}
	}

	@Test
	public void testDeletePerfil() {
		try{
			
		} catch(Exception e){
			fail("Not yet implemented");
		}
	}

}
