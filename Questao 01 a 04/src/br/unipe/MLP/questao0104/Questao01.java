package br.unipe.MLP.questao0104;

public class Questao01 {
/**
DUPLA: JOSÉ NIELSON E LUIZ EUZEBIO


Sabemos que uma grande vantagem do Java é a portabilidade, mas para
isso os compiladores da linguagem funcionam de uma forma diferente.
Explique todo processo da compilação até a execução de um programa em
Java.

RESPOSTA

	PROCESSO DE COMPILAÇÃO
	
	Compilação é o processo de tradução de um código fonte escrito normalmente em uma linguagem 
	de alto nível (de fácil entendimento por parte do programador) para uma linguagem de baixo 
	nível. Um compilador é um programa responsável por executar os processos de compilação descritos 
	a seguir.

	FASES DA COMPILAÇÃO
	
	Análise Léxica
	Esta é a primeira etapa da compilação. A função do analisador léxico, também conhecido como 
	scanner, é analisar todo o código fonte e produzir símbolos (tokens) que podem ser manipulados 
	na etapa seguinte. Nesta etapa são eliminados os espaços em branco e comentários.

	Análise Sintática
	O analisador sintático (parsing) é quem dá significado às sequências de tokens criadas anteriormente.

	Análise Semântica
	Esta etapa é responsável por analisar a semântica, ou significado, de cada elemento do código. 
	É ele quem encontra erros como, por exemplo, uma multiplicação entre tipos de dados diferentes.

	Geração do Código Intermediário
	Nesta etapa ocorre a conversão da árvore sintática, criada na etapa 2, em uma representação 
	intermediário do código fonte.

	Otimização do Código
	Nesta etapa o código é otimizado para uma determinada arquitetura (hardware e sistema operacional 
	especifico).

	Geração de Código Final
	Nesta ultima etapa da compilação, o arquivo executável (.exe) é criado, otimizado para aquela arquitetura.

	COMPILAÇÃO NO JAVA
	Na linguagem Java o processo de compilação ocorre da seguinte maneira:

	1.    O código fonte (extensão .java) é compilado utilizando o javac (Java Compiler) e armazenado 
	em um arquivo de extensão .class, também conhecido como bytecode.

	2.    Em seguida a JVM (Java Virtual Machine), interpreta os bytecodes produzidos pelo compilador.

	3.    O JIT (Just-In-Time) converte, em tempo de execução, o código em bytecode para código de máquina.

	4.    Por ultimo, fica a cargo do Sistema Operacional em questão executar o programa.

	
*/	
}
