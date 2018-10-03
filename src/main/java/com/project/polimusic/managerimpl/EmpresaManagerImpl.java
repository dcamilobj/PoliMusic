package com.project.polimusic.managerimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.polimusic.entity.Empresa;
import com.project.polimusic.manager.EmpresaManager;
import com.project.polimusic.repository.EmpresaRepository;

public class EmpresaManagerImpl implements EmpresaManager {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Empresa findEmpresaById(Integer idEmpresa) {
		// TODO Auto-generated method stub
		return empresaRepository.findById(idEmpresa).get();
	}

	@Override
	public List<Empresa> findEmpresa() {
		// TODO Auto-generated method stub
		return empresaRepository.findAll();
	}

	@Override
	public void deleteEmpresaById(Integer idEmpresa) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa();
		empresa.setIdEmpresa(idEmpresa);
		empresaRepository.delete(empresa);
	}

	@Override
	public Empresa saveEmpresa(Empresa Empresa) {
		// TODO Auto-generated method stub
		return empresaRepository.save(Empresa);
	}

	@Override
	public Empresa updateEmpresa(Integer idEmpresa, Empresa empresa) {
		// TODO Auto-generated method stub
		Empresa empresaToUpdate = empresaRepository.getOne(idEmpresa);
		empresaToUpdate.setPagoOperacion(empresa.getPagoOperacion());
		empresaToUpdate.setEstado(empresa.getEstado());
		return empresaRepository.save(empresaToUpdate);
	}

}
