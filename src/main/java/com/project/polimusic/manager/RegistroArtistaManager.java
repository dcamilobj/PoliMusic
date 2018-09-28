package com.project.polimusic.manager;



import java.util.List;

import com.project.polimusic.entity.RegistroArtista;

public interface RegistroArtistaManager {

    RegistroArtista findRegistroArtistaById(Integer idRegistroArtista);

    List<RegistroArtista> findAllRegistroArtistas();

    void deleteRegistroArtistaById(Integer idRegistroArtista);

    RegistroArtista saveRegistroArtista(RegistroArtista registroArtista);

    RegistroArtista updateRegistroArtista(Integer idRegistroArtista, RegistroArtista registroArtista);
}
