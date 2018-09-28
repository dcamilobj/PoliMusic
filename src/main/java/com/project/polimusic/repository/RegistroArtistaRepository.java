package com.project.polimusic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.polimusic.entity.RegistroArtista;

@Repository
public interface RegistroArtistaRepository extends JpaRepository<RegistroArtista, Integer> {
}
