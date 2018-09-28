package com.project.polimusic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.polimusic.entity.RegistroArtista;
import com.project.polimusic.manager.RegistroArtistaManager;

import java.util.List;

@RestController
@RequestMapping("/registroartista")
public class RegistroArtistaController {

    @Autowired
    private RegistroArtistaManager registroArtistaManager;

    @RequestMapping(method = RequestMethod.GET, value = "/{idRegistroArtista}")
    public RegistroArtista findRegistroArtistaById(@PathVariable Integer idRegistroArtista) {
        return registroArtistaManager.findRegistroArtistaById(idRegistroArtista);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RegistroArtista> findAllRegistroArtistas() {
        return registroArtistaManager.findAllRegistroArtistas();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idUsuario}")
    public void deleteRegistroArtistaById(@PathVariable Integer idRegistroArtista) {
        registroArtistaManager.deleteRegistroArtistaById(idRegistroArtista);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/usuarios")
    public RegistroArtista saveRegistroArtista(@RequestBody RegistroArtista registroArtista) {
        return registroArtistaManager.saveRegistroArtista(registroArtista);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idRegistroArtista}")
    public RegistroArtista updateRegistroArtista(@PathVariable Integer idRegistroArtista, @RequestBody RegistroArtista registroArtista) {
        return registroArtistaManager.updateRegistroArtista(idRegistroArtista, registroArtista);
    }

}
