package br.unipe.cc.MLP.questao10.figuras;

/*
 * Implemente as classes da hierarquia(herança) da classe FiguraGeometrica
mostrada na representação a seguir, aplicando o polimorfismo de
sobreposição para o método desenha(). Em seguida, crie uma classe Lápis
com um método desenha() que recebe como parâmetro um objeto
FiguraGeometrica e realiza uma chamada do método desenha()
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