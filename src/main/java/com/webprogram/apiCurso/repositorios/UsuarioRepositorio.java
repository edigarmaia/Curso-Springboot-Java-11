package com.webprogram.apiCurso.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webprogram.apiCurso.entidades.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	

}
