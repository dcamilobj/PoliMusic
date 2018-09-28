package com.project.polimusic.manager;



import java.util.List;

import com.project.polimusic.entity.ControlArchivo;

public interface ControlArchivoManager {

    ControlArchivo findControlArchivoById(Integer idControlArchivo);

    List<ControlArchivo> findAllControlArchivos();

    void deleteControlArchivoById(Integer idControlArchivo);

    ControlArchivo saveControlArchivo(ControlArchivo controlArchivo);

    ControlArchivo updateControlArchivo(Integer idControlArchivo, ControlArchivo controlArchivo);
}
