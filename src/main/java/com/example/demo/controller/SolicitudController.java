package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Solicitud;
import com.example.demo.model.Usuario;
import com.example.demo.repository.SolicitudRepository;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

	@Autowired
	SolicitudRepository solicitudRepository;
	
	@PostMapping("/add")
	public ResponseEntity<Solicitud> agregarSolicitud(@RequestBody Solicitud solicitud){
		solicitudRepository.save(solicitud);
		return ResponseEntity.status(HttpStatus.CREATED).body(solicitud);
	}
	
	@GetMapping()
	public ResponseEntity<List<Solicitud>> listarSolicitudes(){
		return ResponseEntity.status(HttpStatus.OK).body(solicitudRepository.findAll());
	}
	
}
