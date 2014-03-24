package br.unipe.MLP.questao08.locadora;

/**
 *Uma locadora possui dois tipos de fitas: fita lançamento e fita infantil. A fita
deve ser identificada pelo título e pelo preço de locação. Para calcular o
preço da locação e construir as entidades apresentadas, utilize como regra
as definições a seguir:
a) Fita lançamento possui um valor fixo acrescentado de 20%;
b) Fita infantil possui um valor fixo com desconto de 40%; 

 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Fita fita = new Fita();
		Fita fitaLancamento = new FitaLancamento();
		Fita fitaInfantil = new FitaInfantil();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor fixo para locação de uma fita:");
		double numero = s.nextDouble();

		fita.setPrecoLocacao(numero);
		
		System.out.println("Preço de locação da fita lancamento: ");
		System.out.println(((FitaLancamento) fitaLancamento).calcularPrecoLancamento());
		System.out.println("Preço de locação da fita infatil: ");
		System.out.println(((FitaInfantil) fitaInfantil).calcularPrecoInfantil());
		
	}
}
