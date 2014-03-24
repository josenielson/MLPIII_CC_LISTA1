package br.unipe.MLP.questao06.fatura;

/**
 Crie uma classe chamada Fatura para que uma loja de suprimentos de
informática possa utilizá-la para representar uma fatura de um item vendido
na loja. Uma Fatura deve incluir quatro partes das informações como
variáveis de instância – o número(tipo String), a descrição(tipo String), a
quantidade comprada de um item(tipo int) e o preço por item(tipo double).
Sua classe deve ter um construtor que inicialize as quatro variáveis de
instância e forneça um método set e um get para cada variável de instância.
Além disso, forneça um método chamado getValorFatura que calcula o
valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois
retorna o valor como um double. Se o valor não for positivo, ele deve ser
configurado como 0. Se o preço por item não for positivo ele deve ser
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
