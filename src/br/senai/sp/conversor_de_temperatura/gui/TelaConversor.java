package br.senai.sp.conversor_de_temperatura.gui;

//imports para formatação do texto
import java.awt.Color;
import java.awt.Font;

//imports para tela grafica
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.conversor_de_temperatura.model.Temperatura;

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
		tela.setSize(500, 500);
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
		
		//mensagem de erro
		lblMensagemErro = new JLabel();
		lblMensagemErro.setBounds(150, 180, 360, 100);
		lblMensagemErro.setForeground(Color.red);
        lblMensagemErro.setFont(new Font("Arial", Font.BOLD,16));
				
		
		 //ação para o botão Kelvin funcionar
        buttonKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String txtCelsius = textCelsius.getText();
                try {
                    double celsius = Double.parseDouble(txtCelsius);
                    
                    Temperatura kelvin = new Temperatura();
                    kelvin.setCelsius(celsius);
                    celsius = kelvin.converterParaKelvin();
                    lblResultado.setText(celsius + "KELVIN");
                  //formatação do texto
                } catch (NumberFormatException e2) {
                    lblMensagemErro.setText("Insira um valor válido!");
                    
                }
            }
        });
        
        //ação para o botão Fahreinheit funcionar
        buttonFahreinheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String txtCelsius = textCelsius.getText();
                try {
                    double celsius = Double.parseDouble(txtCelsius);

                    Temperatura fahreinheit = new Temperatura();
                    celsius = fahreinheit.converterParaFahreinheit();
                    lblResultado.setText(celsius +"FAREHINHEIT");
                    //formatação do texto
                } catch (NumberFormatException e2) {
                    lblMensagemErro.setText("Insira um valor válido!");
                    
                }
            }
        });
		
		//recurso para itens aparecerem na tela
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(lblMensagemErro);
		
		//função para tela funcionar
		tela.setVisible(true);
	}
}
