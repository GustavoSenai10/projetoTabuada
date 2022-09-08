package br.senai.sp.jandira;

public class Tabuada {


	public int multiplicador = 5;
	public int maximoMultiplo;
	public int minimoMultiplo;
	public int re;
	
	public String[] getTabuada() {
	
		int tamanho= maximoMultiplo - minimoMultiplo + 1;
		String tabuada[] = new String[tamanho];
		int i = 0;
		while (minimoMultiplo <= maximoMultiplo) {
			
			int produto = multiplicador*minimoMultiplo; 
		
		
			String resultado = multiplicador + " X " + minimoMultiplo + "=" + produto;
			tabuada[i]=resultado;
			
			minimoMultiplo++;
			i++;
		
	}
		//String tabuada[] = { };
		return tabuada;
		
	
	
	}



}
