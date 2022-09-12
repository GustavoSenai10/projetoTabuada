package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Tabuada;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
	
		//Variaveis da "FrameTabuada" ou Janela Tabuada
		FrameTabuada tela = new FrameTabuada();
		tela.altura = 600;
		tela.largura = 470;
		tela.titulo = "Tabuada";
		tela.criarTela();
		
		Tabuada tabuada = new Tabuada();
		
		//tabuada.multiplicador= 9;
		//tabuada.maximoMultiplo= 8;
		//tabuada.minimoMultiplo= 10;
		
		//String[] resultado = tabuada.getTabuada();
		
		//int i = 0;
		
		//while (i< resultado.length) {
			
			//System.out.println(resultado[i]);
			//i++;
		}
		
		

	
	
	
	}


