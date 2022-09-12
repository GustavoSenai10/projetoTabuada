package br.senai.sp.jandira;

public class Tabuada {


	public int multiplicador;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	public int re;
	
	public String[] getTabuada() {
	
		int tamanho= maximoMultiplicador - minimoMultiplicador + 1;
		String tabuada[] = new String[tamanho];
		int i = 0;
		while (minimoMultiplicador <= maximoMultiplicador) {
			
			int produto = multiplicador*minimoMultiplicador; 
		
		
			String resultado = multiplicador + " X " + minimoMultiplicador + "=" + produto;
			tabuada[i]=resultado;
			
			minimoMultiplicador++;
			i++;
		
	}
		//String tabuada[] = { };
		return tabuada;
		
	
	
	}



}
