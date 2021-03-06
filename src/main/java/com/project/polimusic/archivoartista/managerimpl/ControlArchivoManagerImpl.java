package com.project.polimusic.archivoartista.managerimpl;

import com.project.polimusic.archivoartista.entity.ControlArchivo;
import com.project.polimusic.archivoartista.manager.ControlArchivoManager;
import com.project.polimusic.archivoartista.repository.ControlArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControlArchivoManagerImpl implements ControlArchivoManager {

    @Autowired
    private ControlArchivoRepository controlArchivoRepository;

    @Override
    public ControlArchivo findControlArchivoById(Integer idControlArchivo) {
        return controlArchivoRepository.findById(idControlArchivo).get();
    }

    @Override
    public List<ControlArchivo> findAllControlArchivos() {
        return controlArchivoRepository.findAll();
    }

    @Override
    public void deleteControlArchivoById(Integer idControlArchivo){
        ControlArchivo controlArchivo = new ControlArchivo();
        controlArchivo.setIdControlArchivo(idControlArchivo);
        controlArchivoRepository.delete(controlArchivo);
    }

    @Override
    public ControlArchivo saveControlArchivo(ControlArchivo controlArchivo){
        return controlArchivoRepository.save(controlArchivo);
    }

    @Override
    public ControlArchivo updateControlArchivo(Integer idControlArchivo, ControlArchivo controlArchivo){
        ControlArchivo controlArchivoToUpdate = controlArchivoRepository.getOne(idControlArchivo);
        controlArchivoToUpdate.setCantidadLeidos(controlArchivo.getCantidadLeidos());
        controlArchivoToUpdate.setNombreArchivo(controlArchivo.getNombreArchivo());
        controlArchivoToUpdate.setFechaCargue(controlArchivo.getFechaCargue());
        controlArchivoToUpdate.setCantidadErrores(controlArchivo.getCantidadErrores());
        return controlArchivoRepository.save(controlArchivoToUpdate);
    }
}
