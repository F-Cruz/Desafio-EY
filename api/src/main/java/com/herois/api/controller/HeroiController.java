package com.herois.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herois.api.repositorio.HeroiRepositorio;

import datasource.model.Heroi;

	@RestController
	@RequestMapping(value = "/api")
	public class HeroiController {
	
	@Autowired
	private HeroiRepositorio heroiRepositorio;
	
	@GetMapping(path = "/heroi/id/{id}")
	public Optional<Heroi> buscarHeroiPorId (@PathVariable (name = "id", required = true) Long id) {
		
		return heroiRepositorio.findById(id);
		
	}
	
	@PostMapping(path = "/heroi/save")
	public void salvarHeroi(@RequestBody Heroi heroi) {
	
		heroiRepositorio.save(heroi);
	}
	
	@DeleteMapping(path = "/heroi/delete/{id}")
	public void deleteHeroi(@PathVariable (name = "id", required = true)Long id) {
		
		heroiRepositorio.deleteById(id);
	}
}
