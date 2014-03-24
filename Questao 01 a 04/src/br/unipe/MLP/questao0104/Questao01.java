package br.unipe.MLP.questao0104;

public class Questao01 {
/**
DUPLA: JOS� NIELSON E LUIZ EUZEBIO


Sabemos que uma grande vantagem do Java � a portabilidade, mas para
isso os compiladores da linguagem funcionam de uma forma diferente.
Explique todo processo da compila��o at� a execu��o de um programa em
Java.

RESPOSTA

	PROCESSO DE COMPILA��O
	
	Compila��o � o processo de tradu��o de um c�digo fonte escrito normalmente em uma linguagem 
	de alto n�vel (de f�cil entendimento por parte do programador) para uma linguagem de baixo 
	n�vel. Um compilador � um programa respons�vel por executar os processos de compila��o descritos 
	a seguir.

	FASES DA COMPILA��O
	
	An�lise L�xica
	Esta � a primeira etapa da compila��o. A fun��o do analisador l�xico, tamb�m conhecido como 
	scanner, � analisar todo o c�digo fonte e produzir s�mbolos (tokens) que podem ser manipulados 
	na etapa seguinte. Nesta etapa s�o eliminados os espa�os em branco e coment�rios.

	An�lise Sint�tica
	O analisador sint�tico (parsing) � quem d� significado �s sequ�ncias de tokens criadas anteriormente.

	An�lise Sem�ntica
	Esta etapa � respons�vel por analisar a sem�ntica, ou significado, de cada elemento do c�digo. 
	� ele quem encontra erros como, por exemplo, uma multiplica��o entre tipos de dados diferentes.

	Gera��o do C�digo Intermedi�rio
	Nesta etapa ocorre a convers�o da �rvore sint�tica, criada na etapa 2, em uma representa��o 
	intermedi�rio do c�digo fonte.

	Otimiza��o do C�digo
	Nesta etapa o c�digo � otimizado para uma determinada arquitetura (hardware e sistema operacional 
	especifico).

	Gera��o de C�digo Final
	Nesta ultima etapa da compila��o, o arquivo execut�vel (.exe) � criado, otimizado para aquela arquitetura.

	COMPILA��O NO JAVA
	Na linguagem Java o processo de compila��o ocorre da seguinte maneira:

	1.    O c�digo fonte (extens�o .java) � compilado utilizando o javac (Java Compiler) e armazenado 
	em um arquivo de extens�o .class, tamb�m conhecido como bytecode.

	2.    Em seguida a JVM (Java Virtual Machine), interpreta os bytecodes produzidos pelo compilador.

	3.    O JIT (Just-In-Time) converte, em tempo de execu��o, o c�digo em bytecode para c�digo de m�quina.

	4.    Por ultimo, fica a cargo do Sistema Operacional em quest�o executar o programa.

	
*/	
}
