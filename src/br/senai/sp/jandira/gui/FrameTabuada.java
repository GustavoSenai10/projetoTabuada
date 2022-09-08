package br.senai.sp.jandira.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela(){ 
	
		JFrame tela= new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//obter uma Referencia do painel de controle  
		Container painel = tela.getContentPane();
		painel.setBackground(null);
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(30, 20, 100, 30);
		
		//Multiplicador
		JLabel labelMultiplicador = new JLabel();
		labelMultiplicador.setText("Multiplicador :");
		labelMultiplicador.setBounds(30, 70, 100, 30);
		
		JTextField textFieldMultiplicador = new JTextField();
		textFieldMultiplicador.setBounds(30, 100, 200, 30);
		
		//Maximo Multiplicador
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Maximo :"); 
		labelMaximoMultiplicador.setBounds(30, 150, 100, 30);
		
		JTextField textFieldMaximoMultiplicado = new JTextField();
		textFieldMaximoMultiplicado.setBounds(30, 180, 200, 30);
		//Minimo Multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Minimo : ");
		labelMinimoMultiplicador.setBounds(30, 200, 200, 30);
		
		JTextField textfieldMinimoMultiplicador = new JTextField();
		textfieldMinimoMultiplicador.setBounds(30, 250, 250, 30);
		
		
		//Botão "Calcular"
		JButton buttonCalcular= new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(489, 300, 100, 30);
		
		//Botão "Limpar"
		JButton buttonLimpar= new JButton();
		buttonLimpar.setText("Lmpar");
		buttonLimpar.setBounds(500, 410, 100, 30);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado :"); 
		labelResultado.setBounds(30, 500, 500, 30);
		
		 
		
		//Adicionar no Painel
		painel.add(labelTabuada);
		painel.add(labelMultiplicador);
		painel.add(textFieldMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicado);
		painel.add(labelMinimoMultiplicador);
		painel.add(textfieldMinimoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		
		//Tornar o Painel Visivel
		tela.setVisible(true);
		

	}



}

