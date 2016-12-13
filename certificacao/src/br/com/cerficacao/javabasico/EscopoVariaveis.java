package br.com.cerficacao.javabasico;

public class EscopoVariaveis {
	/*
	 * Variaveis de intancia
	 * atributo da classe
	 * podem tem o mesmo o nome de variavel de escopo, usando o this para diferencia-las 
	 * Sem o this, o compilador usa a variavél com o menor escopo. 
	 * */
	static int  x = 0; 
	int y = 0;
	
	/*
	 * Variavel de escopo
	 * Acessivel apenas dentro do escopo que foi declarada
	 * */
	public void setX(int x ){
		this.x = x;
	}
	
	public void setY(int y /*Variavel de escopo*/){
		this.y = y;
	}

}
