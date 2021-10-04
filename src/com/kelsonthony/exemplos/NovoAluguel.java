package com.kelsonthony.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.kelsonthony.model.Aluguel;
import com.kelsonthony.model.Carro;
import com.kelsonthony.model.Cliente;

public class NovoAluguel {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João", LocalDate.of(2010, Month.JUNE, 13));
		
		Carro carro = new Carro("Gol", 90.0, Year.of(2018));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		
		
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now()
				.plusDays(3)
				.plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		imprimirAluguelCarro(aluguel);
	}

	private static void imprimirAluguelCarro(Aluguel aluguel) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(">>>>>>>> Recibo <<<<<<<<<<<<<");
		System.out.println("Carro: " + aluguel.getCarro().getNome());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		System.out.println("Valor: " + aluguel.getCarro().getValorDiaria());
		System.out.println("Data e hora de retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}
}
