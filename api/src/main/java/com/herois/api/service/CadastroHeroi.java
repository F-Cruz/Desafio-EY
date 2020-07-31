package com.herois.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.herois.api.repositorio.HeroiRepositorio;


import datasource.model.Heroi;

public class CadastroHeroi {
	
	@Autowired
	private HeroiRepositorio heroiRepositorio;
	
	public void Cadastro(Heroi heroi) {
		heroiRepositorio.saveAndFlush(heroi);
	}
}
