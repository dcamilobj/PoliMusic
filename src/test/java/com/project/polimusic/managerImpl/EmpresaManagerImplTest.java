package com.project.polimusic.managerImpl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.polimusic.entity.Empresa;
import com.project.polimusic.manager.EmpresaManager;

public class EmpresaManagerImplTest {
	@Autowired
	EmpresaManager empresaManager;



	@Test
	public void testSaveEmpresa() {
		try {
			Empresa empresa = new Empresa();
                empresa.setListTipoDocumento(null);
                empresa.setNroDocumento("99999985748");
                empresa.setNombre("iTunes");
                empresa.setPagoOperacion(500.0);
                empresa.setEstado("S");

			empresaManager.saveEmpresa(empresa);
		} catch (Exception e) {
			fail("Error al guardar la Empresa- " + e);
		}
	}

	@Test
	public void testGetEmpresaById() {
		try {
			Empresa empresa = empresaManager.findEmpresaById(1);
			assertNotNull(empresa);
		} catch (Exception e) {
			fail("Error al obtener la Empresa- " + e);
		}
	}

	@Test
	public void testDeleteEmpresa() {
		try {
			Empresa empresa = new Empresa();
			empresa.setIdEmpresa(1);
			empresa.setEstado("N");
			empresaManager.deleteEmpresaById(1);
		} catch (Exception e) {
			fail("Error al eliminar la Empresa- " + e);
		}
	}

}
