package br.unipe.MLP.questao06.fatura;

/**
 Crie uma classe chamada Fatura para que uma loja de suprimentos de
inform�tica possa utiliz�-la para representar uma fatura de um item vendido
na loja. Uma Fatura deve incluir quatro partes das informa��es como
vari�veis de inst�ncia � o n�mero(tipo String), a descri��o(tipo String), a
quantidade comprada de um item(tipo int) e o pre�o por item(tipo double).
Sua classe deve ter um construtor que inicialize as quatro vari�veis de
inst�ncia e forne�a um m�todo set e um get para cada vari�vel de inst�ncia.
Al�m disso, forne�a um m�todo chamado getValorFatura que calcula o
valor da fatura (isso �, multiplica a quantidade pelo pre�o por item) e depois
retorna o valor como um double. Se o valor n�o for positivo, ele deve ser
configurado como 0. Se o pre�o por item n�o for positivo ele deve ser
configurado como 0.0.

 */


public class Fatura {
	
	private String numero;
	private String descricao;
	private int qtdCompra;
	private double precoItem;
	
	
	public Fatura(String numero, String descricao, int qtdCompra, double precoItem){
		
		this.numero = numero;
		this.descricao = descricao;
		this.precoItem = precoItem;
		this.qtdCompra = qtdCompra;
		
		
		
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQtdCompra() {
		return qtdCompra;
	}


	public void setQtdCompra(int qtdCompra) {
		if(qtdCompra > 0){
		this.qtdCompra = qtdCompra;
		}else{
			this.qtdCompra = qtdCompra;
		}
		
	}


	public double getPrecoItem() {
		return precoItem;
	}


	public void setPrecoItem(double precoItem) {
		if(precoItem > 0){
		this.precoItem = precoItem;
		}else{
			this.precoItem = precoItem;
		}
	}
	

}
