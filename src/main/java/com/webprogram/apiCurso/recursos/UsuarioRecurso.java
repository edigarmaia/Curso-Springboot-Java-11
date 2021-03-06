package com.webprogram.apiCurso.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webprogram.apiCurso.entidades.Usuario;
import com.webprogram.apiCurso.servicos.UsuarioServico;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {

	@Autowired
	private UsuarioServico servico;
	
	//Método Get
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = servico.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	//Buscar usuario por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		Usuario obj = servico.findById(id);		
		return ResponseEntity.ok().body(obj);
	}

}
