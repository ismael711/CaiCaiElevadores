package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador(); //instanciando
		objeto.inicializar("Torre A",  20, 10, 0);
		System.out.println(objeto.toString());
		objeto.entrar();
		objeto.entrar();
		objeto.subir(2);
		System.out.println(objeto.toString());
		objeto.descer();
		objeto.sair();
		System.out.println(objeto.toString());

	}

}
