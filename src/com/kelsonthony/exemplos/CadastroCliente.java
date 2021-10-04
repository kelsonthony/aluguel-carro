package com.kelsonthony.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.kelsonthony.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jo�o", LocalDate.of(2010, Month.JUNE, 13));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.println("OK, pode ser cadastrado");
		} else {
			System.out.printf("Sua idade �: %d. Ent�o n�o pode ter carteira", idade);
		}
		
		
	}
}
