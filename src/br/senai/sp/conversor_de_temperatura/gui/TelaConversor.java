package br.senai.sp.conversor_de_temperatura.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConversor {
	private JLabel lblCelsius;
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	
	
	public void criarTela() {
		
		//formatação de tela
		JFrame tela = new JFrame();
		tela.setSize(500, 525);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		
		//configurações para inserir os graus celsius
		lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus celsius");
		lblCelsius.setBounds(50, 10, 200, 25);		
		
		textCelsius = new JTextField();
		textCelsius.setText("");
		textCelsius.setBounds(50, 50, 380, 40);
		
		
		//botão Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(50, 100, 180, 40);
		

		//botão Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(250, 100, 180, 40);
		
		//resultado
		lblResultado = new JLabel();
		lblResultado.setBounds(165,150,360, 100);
		lblResultado.setFont(new Font("Arial", Font.BOLD,20));
				
		
		 //ação para o botão Kelvin
        buttonKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textCelsius.getText());
                    double kelvin = celsius + 273.15;
                    lblResultado.setText(String.valueOf(kelvin + " KELVIN"));
                } catch (NumberFormatException e2) {
                    lblResultado.setText("Insira um valor válido!");
                    lblResultado.setForeground(Color.red);
                    lblResultado.setFont(new Font("Arial", Font.BOLD,16));
                }
            }
        });
        
        //ação para o botão Fahreinheit
        buttonFahreinheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textCelsius.getText());
                    double fahreinheit = celsius * 1.8 + 32;
                    lblResultado.setText(String.valueOf(fahreinheit + " FAHREINHEIT"));
                } catch (NumberFormatException e2) {
                    lblResultado.setText("Insira um valor válido!");
                    lblResultado.setForeground(Color.red);
                    lblResultado.setFont(new Font("Arial", Font.BOLD,16));
                }
            }
        });
		
		
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(lblResultado);
		
		
		tela.setVisible(true);
	}
}
