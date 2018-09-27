package com.project.polimusic.archivoartista.manager;

import com.project.polimusic.archivoartista.entity.ControlArchivo;

import java.util.List;

public interface ControlArchivoManager {

    ControlArchivo findControlArchivoById(Integer idControlArchivo);

    List<ControlArchivo> findAllControlArchivos();

    void deleteControlArchivoById(Integer idControlArchivo);

    ControlArchivo saveControlArchivo(ControlArchivo controlArchivo);

    ControlArchivo updateControlArchivo(Integer idControlArchivo, ControlArchivo controlArchivo);
}
