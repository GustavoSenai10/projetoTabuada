package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// obter uma Referencia do painel de controle
		Container painel = tela.getContentPane();
		painel.setBackground(Color.white);

		// icone
		ImageIcon iconeTabauada = new ImageIcon("src/br/senai/sp/jandira/imagens/calculadora.png");
		JLabel icone = new JLabel(iconeTabauada);
		icone.setBounds(6, 20, 40, 40);

		// Titulo
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setForeground(Color.red);
		labelTabuada.setFont(new Font("Arial", Font.BOLD, 15));
		labelTabuada.setBounds(60, 10, 150, 20);

		// SUB-Titulo
		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
		labelSubTitulo.setBounds(60, 40, 500, 20);
		labelSubTitulo.setForeground(Color.gray);

		// sub-titulo 2
		JLabel labelSubTituloDois = new JLabel();
		labelSubTituloDois.setText("a tabuada que desejar em segundos!");
		labelSubTituloDois.setBounds(60, 55, 500, 20);
		labelSubTituloDois.setForeground(Color.gray);

		// Multiplicador
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicador: ");
		labelMultiplicando.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		labelMultiplicando.setBounds(60, 90, 150, 20);

		// TextField Multiplicador
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		textFieldMultiplicando.setBounds(150, 90, 100, 20);

		// minimo Multiplicador
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador: ");
		labelMinimoMultiplicador.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		labelMinimoMultiplicador.setBounds(10, 140, 200, 20);

		// TextField Minimo Multiplicador
		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		textFieldMinimoMultiplicador.setBounds(150, 145, 100, 20);

		// Maximo Multiplicador
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador: ");
		labelMaximoMultiplicador.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		labelMaximoMultiplicador.setBounds(10, 190, 200, 20);

		// TextFild Maximo Multiplicador
		JTextField textfieldMaximoMultiplicador = new JTextField();
		textfieldMaximoMultiplicador.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		textfieldMaximoMultiplicador.setBounds(150, 190, 100, 20);

		// botão Calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setFont(new Font("Arial", Font.BOLD, 15));
		buttonCalcular.setBounds(100, 250, 150, 40);

		// Botão Limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBackground(Color.yellow);
		buttonLimpar.setFont(new Font("Arial", Font.BOLD, 15));
		buttonLimpar.setBounds(270, 250, 150, 40);

		// Resultado
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");
		labelResultado.setFont(new Font("Aril", Font.BOLD, 20));
		labelResultado.setBounds(30, 300, 150, 40);

		// jList
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(30, 350, 400, 200);
		JList lista = new JList();
		lista.setFont(new Font("Aril", Font.BOLD, 15));
		lista.setBackground(Color.yellow);

		// Painel
		painel.add(icone);
		painel.add(labelTabuada);
		painel.add(labelSubTitulo);
		painel.add(labelSubTituloDois);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMaximoMultiplicador);
		painel.add(textfieldMaximoMultiplicador);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(lista);

		// Tela
		tela.setVisible(true);

		// Ação do Butão calcular
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// Caso Ouver Erros
				try {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicador = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textfieldMaximoMultiplicador.getText());

					if (tabuada.minimoMultiplicador <= tabuada.maximoMultiplicador) {
						lista.setListData(tabuada.getTabuada());
						scroll.getViewport().add(lista);
					} else {

						JOptionPane.showMessageDialog(null,
								"O maximo multiplicador tem que ser maior ou igual a minimo", "ERRO",
								JOptionPane.OK_OPTION);
					}
				}catch (Exception ex) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Por Favor digita um Número", "ERRO", JOptionPane.OK_OPTION);
				}
			}
		});

		// Ação do Butão Limpar
		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textFieldMultiplicando.setText(null);
				textFieldMinimoMultiplicador.setText(null);
				textfieldMaximoMultiplicador.setText(null);
				
				//limpar o JList
				String[] limpar = {""};
				lista.setListData(limpar);

			}
		});

	}

}