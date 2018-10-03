package com.project.polimusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.polimusic.entity.ControlArchivo;
import com.project.polimusic.entity.Empresa;
import com.project.polimusic.manager.EmpresaManager;

@RestController
@RequestMapping("/Empresa")
public class EmpresaController {

    @Autowired
    private EmpresaManager empresaManager;

    @RequestMapping(method = RequestMethod.GET, value = "/{idEmpresa}")
    public Empresa findControlArchivoById(@PathVariable Integer idEmpresa) {
        return empresaManager.findEmpresaById(idEmpresa);
    }
}
