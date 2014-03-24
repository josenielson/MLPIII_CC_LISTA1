package br.unipe.MLP.questao0104;

public class Questao02 {
/**
Defina e exemplifique cada uma das partes de um objeto:
• Um estado (atributos)
• Um comportamento (métodos)
• Interface (assinaturas)
• Uma identidade

RESPOSTA

	- ATRIBUTO
	Os Atributos em Programação Orientada a Objetos 
	são os elementos que definem a estrutura de uma 
	classe. Os atributos também são conhecidos como 
	variáveis de classe, e podem ser divididos em 
	dois tipos básicos: atributos de instância e de 
	classe. Os valores dos atributos de instância 
	determinam o estado de cada objeto. Um atributo 
	de classe possui um estado que é compartilhado 
	por todos os objetos de uma classe. Atributos 
	de classe podem ser chamados também de atributos 
	estáticos ou constantes.
	
	Exemplo:
	private int x;
	private float y = 10000.0F;
	public String nome = "Jose, Luiz"
	
	-MÉTODOS
	Em orientação a objeto, um método é uma 
	subrotina que é executada por um objeto. 
	Os métodos determinam o comportamento 
	dos objetos de uma classe e são análogos 
	à funções ou procedimentos da programação
	estruturada. A chamada de métodos pode ou 
	não alterar o estado de um objeto.

	Exemplo:
	public void setaPeso (int p) {
    if ( p > 0 ) {
    peso = p;
	}

	-INTERFACE
	
	Uma interface pode definir uma série de 
	métodos, mas nunca conter implementação 
	deles. Ela só expõe o que o objeto deve 
	fazer, e não como ele faz, nem o que ele 
	tem. Como ele faz vai ser definido em 
	uma implementação dessa interface.
	
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
