package com.project.polimusic.archivoartista.repository;

import com.project.polimusic.archivoartista.entity.ControlArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlArchivoRepository extends JpaRepository<ControlArchivo, Integer> {
}
