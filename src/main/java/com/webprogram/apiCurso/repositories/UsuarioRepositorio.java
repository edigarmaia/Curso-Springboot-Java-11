package com.webprogram.apiCurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webprogram.apiCurso.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	

}
