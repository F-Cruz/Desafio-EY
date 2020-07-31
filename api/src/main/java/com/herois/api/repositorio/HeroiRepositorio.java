package com.herois.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import datasource.model.Heroi;

public interface HeroiRepositorio extends JpaRepository <Heroi, Long>{



}
