package com.aceleracao.modela.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CarsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255, nullable = false)
    private String modelo;

    @Column(length = 255, nullable = false)
	private String fabricante;

    @Column(length = 255, nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private int anoModelo;
}
