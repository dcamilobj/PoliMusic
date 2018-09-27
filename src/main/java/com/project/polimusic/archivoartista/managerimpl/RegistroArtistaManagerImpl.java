package com.project.polimusic.archivoartista.managerimpl;

import com.project.polimusic.archivoartista.entity.RegistroArtista;
import com.project.polimusic.archivoartista.manager.RegistroArtistaManager;
import com.project.polimusic.archivoartista.repository.RegistroArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroArtistaManagerImpl implements RegistroArtistaManager {

    @Autowired
    private RegistroArtistaRepository registroArtistaRepository;

    @Override
    public RegistroArtista findRegistroArtistaById(Integer idRegistroArtista) {
        return registroArtistaRepository.findById(idRegistroArtista).get();
    }

    @Override
    public List<RegistroArtista> findAllRegistroArtistas() {
        return registroArtistaRepository.findAll();
    }

    @Override
    public void deleteRegistroArtistaById(Integer idRegistroArtista){
        RegistroArtista registroArtista = new RegistroArtista();
        registroArtista.setIdRegistroArtista(idRegistroArtista);
        registroArtistaRepository.delete(registroArtista);
    }

    @Override
    public RegistroArtista saveRegistroArtista(RegistroArtista registroArtista){
        return registroArtistaRepository.save(registroArtista);
    }

    @Override
    public RegistroArtista updateRegistroArtista(Integer idRegistroArtista, RegistroArtista registroArtista){
        RegistroArtista registroArtistaToUpdate = registroArtistaRepository.getOne(idRegistroArtista);
        registroArtistaToUpdate.setValor(registroArtista.getValor());
        registroArtistaToUpdate.setListTipoCampo(registroArtista.getListTipoCampo());
        registroArtistaToUpdate.setListControlArchivo(registroArtista.getListControlArchivo());
        return registroArtistaRepository.save(registroArtistaToUpdate);
    }
}
