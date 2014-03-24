package br.unipe.cc.MLP.questao10.figuras;

/*
 * Implemente as classes da hierarquia(heran�a) da classe FiguraGeometrica
mostrada na representa��o a seguir, aplicando o polimorfismo de
sobreposi��o para o m�todo desenha(). Em seguida, crie uma classe L�pis
com um m�todo desenha() que recebe como par�metro um objeto
FiguraGeometrica e realiza uma chamada do m�todo desenha()
pertencente ao objeto FiguraGeometrica.
 */

public class Programa {

	public static void main(String[] args) {
		
	
	FiguraGeometrica circulo = new Circulo();
	FiguraGeometrica quadrado = new Quadrado();
	FiguraGeometrica triangulo = new Triangulo();
	
	Lapis fgc = new Lapis(circulo);
	Lapis fgq = new Lapis(quadrado);
	Lapis fgt = new Lapis(triangulo);
	
	fgc.acao();
	fgq.acao();
	fgt.acao();
	}
}