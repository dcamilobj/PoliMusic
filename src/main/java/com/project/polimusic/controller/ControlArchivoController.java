package com.project.polimusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.polimusic.entity.ControlArchivo;
import com.project.polimusic.manager.ControlArchivoManager;

import java.util.List;

@RestController
@RequestMapping("/controlarchivo")
public class ControlArchivoController {

    @Autowired
    private ControlArchivoManager controlArchivoManager;

    @RequestMapping(method = RequestMethod.GET, value = "/{idControlArchivo}")
    public ControlArchivo findControlArchivoById(@PathVariable Integer idControlArchivo) {
        return controlArchivoManager.findControlArchivoById(idControlArchivo);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ControlArchivo> findAllControlArchivos() {
        return controlArchivoManager.findAllControlArchivos();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idControlArchivo}")
    public void deleteControlArchivoById(@PathVariable Integer idControlArchivo) {
        controlArchivoManager.deleteControlArchivoById(idControlArchivo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/controlarchivos")
    public ControlArchivo saveControlArchivo(@RequestBody ControlArchivo controlArchivo) {
        return controlArchivoManager.saveControlArchivo(controlArchivo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idControlArchivo}")
    public ControlArchivo updateControlArchivo(@PathVariable Integer idControlArchivo, @RequestBody ControlArchivo controlArchivo) {
        return controlArchivoManager.updateControlArchivo(idControlArchivo, controlArchivo);
    }

}
