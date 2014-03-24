package br.unipe.MLP.lista1.Agenda;

/*
 * Faça um programa que simule uma agenda telefônica (utilizando Arrays),
em que cada contato possui um nome e um número de telefone. Você
deverá implementar os métodos de adicionar, procurar, editar, listar e
remover contatos.
Agenda Telefônica
1. Adicionar Contato
2. Procurar Contatos
3. Editar Contato
4. Listar Contatos
5. Remover Contato
6. Fechar Agenda

...
 */

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int opcao = 0;
		String nomeTeste;
		String telefoneTeste;
		Contato c = new Contato();
			
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("1. Adicionar Contato;");
			System.out.println("2. Procurar Contatos;");
			System.out.println("3. Editar Contato;");
			System.out.println("4. Listar Contatos;");
			System.out.println("5. Remover Contato;");
			System.out.println("6. Fechar Agenda.");
			opcao = s.nextInt();
		
		switch(opcao){
						
			case 1:{
				
				System.out.println("Adicionar Contato:");
				
				System.out.println("Digite o nome:");
				nomeTeste = s.nextLine();
				System.out.println("Digite o numero:");
				telefoneTeste = s.nextLine();
				c.adcionarContato(nomeTeste, telefoneTeste);
			}break;
		
			case 2:{
				System.out.println("2. Procurar Contato:");
				//c.procurar();
			}break;
			
			case 3:{
				System.out.println("Editar Contato:");
				
				System.out.println("Digite o nome a procurar:");
				nomeTeste = s.nextLine();
				System.out.println("Digite o novo numero:");
				telefoneTeste = s.nextLine();
				c.editar(nomeTeste, telefoneTeste);
			}break;
		
			case 4:{
				System.out.println("Lista Contatos:");
				
				c.listar();
			}break;
			
			case 5:{
				System.out.println("Remover Contato:");
				
				//c.remover(nomeTeste);
			}break;
		
			case 6:{
				break;
			}
			
		}
		
		}while(opcao != 6);
		
	}
	
}
