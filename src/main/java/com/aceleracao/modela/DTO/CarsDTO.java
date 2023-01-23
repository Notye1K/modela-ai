package com.aceleracao.modela.DTO;

public record CarsDTO(
    String modelo,
	String fabricante,
	String dataFabricacao,
	Double valor,
	int anoModelo
) {
    
}
