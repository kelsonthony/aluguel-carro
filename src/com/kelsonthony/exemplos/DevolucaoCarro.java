package com.kelsonthony.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.kelsonthony.model.Aluguel;
import com.kelsonthony.model.Carro;
import com.kelsonthony.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		//para cada hora de atraso, ele paga 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(3), LocalTime.now());
		
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimeFatura();

	}
	
	private static Aluguel recuperarAluguel() {
		
		Cliente cliente = new Cliente("João", LocalDate.of(1986, Month.JUNE, 13));
		
		Carro carro = new Carro("Gol", 90.0, Year.of(2018));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now()
				.plusDays(3)
				.plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		return aluguel;
	}

}
