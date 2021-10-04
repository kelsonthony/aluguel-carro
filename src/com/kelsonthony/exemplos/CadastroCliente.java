package com.kelsonthony.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.kelsonthony.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João", LocalDate.of(2010, Month.JUNE, 13));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.println("OK, pode ser cadastrado");
		} else {
			System.out.printf("Sua idade é: %d. Então não pode ter carteira", idade);
		}
		
		
	}
}
