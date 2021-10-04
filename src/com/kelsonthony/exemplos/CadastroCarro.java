package com.kelsonthony.exemplos;

import java.time.Year;	
import java.util.Arrays;
import java.util.List;

import com.kelsonthony.model.Carro;

public class CadastroCarro {

	public static void main(String[] args) {
		
		TestandoCarros();

	}

	private static void TestandoCarros() {
		Carro gol = new Carro("Gol", 90.0, Year.of(2018));
		Carro cruze = new Carro("Cruze", 200.0, Year.parse("2021"));
		Carro celta = new Carro("Celta", 2015, Year.of(2018));
		
		List<Carro> carros = Arrays.asList(gol, cruze, celta);
		
		carros.stream()
		.filter(c -> c.getAnoFabricacao().isAfter(Year.of(2020)))
		.forEach(c -> System.out.println(c.getNome()));
	}

}
