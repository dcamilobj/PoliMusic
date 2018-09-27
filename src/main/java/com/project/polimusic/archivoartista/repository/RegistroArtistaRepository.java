package com.project.polimusic.archivoartista.repository;

import com.project.polimusic.archivoartista.entity.RegistroArtista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroArtistaRepository extends JpaRepository<RegistroArtista, Integer> {
}
