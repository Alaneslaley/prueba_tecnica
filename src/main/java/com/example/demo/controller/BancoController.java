package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Banco;
import com.example.demo.model.Usuario;
import com.example.demo.repository.bancoRepository;

@RestController
@RequestMapping("/bancos")
public class BancoController {

	@Autowired
	bancoRepository bancoRepository;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Banco>> getUsuarioPorId(@PathVariable Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(bancoRepository.findById(id));
	}
}
