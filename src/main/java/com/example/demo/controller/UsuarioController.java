package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioRepository usuarioRepository;
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> getUsuarioPorId(@PathVariable Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findById(id));
	}
}
