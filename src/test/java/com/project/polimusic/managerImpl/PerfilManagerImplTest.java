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
			fail("Error - " + e);
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
