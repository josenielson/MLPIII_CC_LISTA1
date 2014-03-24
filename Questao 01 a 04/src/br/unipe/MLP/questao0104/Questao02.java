package br.unipe.MLP.questao0104;

public class Questao02 {
/**
Defina e exemplifique cada uma das partes de um objeto:
� Um estado (atributos)
� Um comportamento (m�todos)
� Interface (assinaturas)
� Uma identidade

RESPOSTA

	- ATRIBUTO
	Os Atributos em Programa��o Orientada a Objetos 
	s�o os elementos que definem a estrutura de uma 
	classe. Os atributos tamb�m s�o conhecidos como 
	vari�veis de classe, e podem ser divididos em 
	dois tipos b�sicos: atributos de inst�ncia e de 
	classe. Os valores dos atributos de inst�ncia 
	determinam o estado de cada objeto. Um atributo 
	de classe possui um estado que � compartilhado 
	por todos os objetos de uma classe. Atributos 
	de classe podem ser chamados tamb�m de atributos 
	est�ticos ou constantes.
	
	Exemplo:
	private int x;
	private float y = 10000.0F;
	public String nome = "Jose, Luiz"
	
	-M�TODOS
	Em orienta��o a objeto, um m�todo � uma 
	subrotina que � executada por um objeto. 
	Os m�todos determinam o comportamento 
	dos objetos de uma classe e s�o an�logos 
	� fun��es ou procedimentos da programa��o
	estruturada. A chamada de m�todos pode ou 
	n�o alterar o estado de um objeto.

	Exemplo:
	public void setaPeso (int p) {
    if ( p > 0 ) {
    peso = p;
	}

	-INTERFACE
	
	Uma interface pode definir uma s�rie de 
	m�todos, mas nunca conter implementa��o 
	deles. Ela s� exp�e o que o objeto deve 
	fazer, e n�o como ele faz, nem o que ele 
	tem. Como ele faz vai ser definido em 
	uma implementa��o dessa interface.
	
	Exemplo:
	class Gerente extends Funcionario implements Autenticavel {
  	private int senha; 
  	public boolean autentica(int senha) {
    if(this.senha != senha) {
      return false;
    }
    return true;
  	} 
	}	

	-IDENTIDADE
	
	Faltando Identidade e exemplo

 */

}
