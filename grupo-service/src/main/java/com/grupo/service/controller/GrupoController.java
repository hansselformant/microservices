package com.grupo.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.service.entidades.Grupo;
import com.grupo.service.repositorio.GrupoRepository;

@RestController
@RequestMapping("/grupo")
public class GrupoController {
	
	@Autowired
	public GrupoRepository grupoRepository;

	@GetMapping
	public List<Grupo> getAllGrupos() {
		return grupoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Grupo getGrupoById(@PathVariable Long id) {
		return grupoRepository.findById(id).get();
	}
	
	@PostMapping
	public void crearGrupo(@RequestBody Grupo grupo) {
		grupoRepository.save(grupo);
	}

}
