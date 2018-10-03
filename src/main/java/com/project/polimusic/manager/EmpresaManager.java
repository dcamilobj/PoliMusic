package com.project.polimusic.manager;

import java.util.List;

import com.project.polimusic.entity.Empresa;

public interface EmpresaManager {
	
	 Empresa findEmpresaById(Integer idEmpresa);

	    List<Empresa> findEmpresa();

	    void deleteEmpresaById(Integer idEmpresa);

	    Empresa saveEmpresa(Empresa Empresa);

	    Empresa updateEmpresa(Integer idEmpresa, Empresa Empresa);

}
