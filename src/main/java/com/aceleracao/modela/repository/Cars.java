package com.aceleracao.modela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracao.modela.model.CarsModel;

public interface Cars extends JpaRepository<CarsModel, Long>{
    
}
