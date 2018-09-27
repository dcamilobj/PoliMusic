package com.project.polimusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.project.polimusic.archivoartista")
@EnableJpaRepositories("com.project.polimusic.archivoartista.repository")
@EntityScan("com.project.polimusic.archivoartista.entity")
public class PoliMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliMusicApplication.class, args);
	}
}
