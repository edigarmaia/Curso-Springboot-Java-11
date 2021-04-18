package com.webprogram.apiCurso.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webprogram.apiCurso.entidades.Usuario;
import com.webprogram.apiCurso.repositorios.UsuarioRepositorio;


@Service
public class UsuarioServico {

	//Injeção de dependencia @AutoWired
	@Autowired
	private UsuarioRepositorio repositorio;
	
	//Retorna todos os usuários do banco de dados
	public List<Usuario> findAll(){
		return repositorio.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario>obj = repositorio.findById(id);
		return obj.get();
	}
}
