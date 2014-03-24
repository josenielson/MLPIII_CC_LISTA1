package br.unipe.MLP.questao08.locadora;

/**
 *Uma locadora possui dois tipos de fitas: fita lan�amento e fita infantil. A fita
deve ser identificada pelo t�tulo e pelo pre�o de loca��o. Para calcular o
pre�o da loca��o e construir as entidades apresentadas, utilize como regra
as defini��es a seguir:
a) Fita lan�amento possui um valor fixo acrescentado de 20%;
b) Fita infantil possui um valor fixo com desconto de 40%; 

 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Fita fita = new Fita();
		Fita fitaLancamento = new FitaLancamento();
		Fita fitaInfantil = new FitaInfantil();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor fixo para loca��o de uma fita:");
		double numero = s.nextDouble();

		fita.setPrecoLocacao(numero);
		
		System.out.println("Pre�o de loca��o da fita lancamento: ");
		System.out.println(((FitaLancamento) fitaLancamento).calcularPrecoLancamento());
		System.out.println("Pre�o de loca��o da fita infatil: ");
		System.out.println(((FitaInfantil) fitaInfantil).calcularPrecoInfantil());
		
	}
}
