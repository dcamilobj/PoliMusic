package com.project.polimusic.archivoartista.manager;

import com.project.polimusic.archivoartista.entity.RegistroArtista;

import java.util.List;

public interface RegistroArtistaManager {

    RegistroArtista findRegistroArtistaById(Integer idRegistroArtista);

    List<RegistroArtista> findAllRegistroArtistas();

    void deleteRegistroArtistaById(Integer idRegistroArtista);

    RegistroArtista saveRegistroArtista(RegistroArtista registroArtista);

    RegistroArtista updateRegistroArtista(Integer idRegistroArtista, RegistroArtista registroArtista);
}
