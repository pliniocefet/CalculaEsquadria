package gui;
import gui.JanelaCorrer2F;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import calculos.CalcularJanelaCorrer2F;


public class Principal extends JFrame{
	
	//Vari�veis de inst�ncia
	JFrame tela;
	JPanel painel;
	GridLayout configGridLayout;
	JButton btJanelaCorrer;		
	JButton btMaxiar; 		
	JButton btPortaCorrer; 		
	JButton btFixo;		
	JButton btPortaGiro;		
	JButton btJanelaVeneziana;		
	JButton btPortaVeneziana;		
	JMenuBar mbMenuBar;  
	JMenu mMenu;
	JMenuItem miSair;
	
	
	public Principal(){
		
		//Instancia os objetos respons�veis por criar a tela
		tela = new JFrame("Calcular Esquadrias");
		painel = new JPanel();
		mbMenuBar = new JMenuBar();
		mMenu = new JMenu("Menu");
		miSair = new JMenuItem("Sair");
		btJanelaCorrer = new JButton("Janela Correr");
		btMaxiar = new JButton("Maxiar");
		btPortaCorrer = new JButton("Porta Correr");
		btFixo = new JButton("Fixo");
		btPortaGiro = new JButton("Porta Giro");
		btJanelaVeneziana = new JButton("Janela Veneziana");
		btPortaVeneziana = new JButton("Porta Veneziana");
		
		// seta o layout do frame para nulo
		tela.setLayout(null);   
		
		// adiciona os menus no frame
		tela.setJMenuBar(mbMenuBar); // seta o menuBar dentro de frame
		mbMenuBar.add(mMenu); // adiciona o menu "File" na barra de menus
		mMenu.add(miSair); // adiciona o item "Exit" no menu File.
		
		
		// configura��o do layout do painel 
		configGridLayout = new GridLayout(3,2); // Instancia um objeto GridLayout com 3 linhas x 2 colunas
		configGridLayout.setHgap(3); // seta o espa�o entre os elementos dentro do grid na horizontal
		configGridLayout.setVgap(3); // seta o espa�o entre os elementos dentro do grid na vertical
		painel.setLayout(configGridLayout); //seta o layout do painel
		painel.setBounds(20, 150, 450, 100); // posiciona o painel no frame
		
		
		painel.add(btJanelaCorrer); //adiciona o bot�o no frame
		painel.add(btMaxiar); //adiciona o bot�o no frame
		painel.add(btPortaCorrer); //adiciona o bot�o no frame
		painel.add(btFixo); //adiciona o bot�o no frame
		painel.add(btPortaGiro); //adiciona o bot�o no frame
		painel.add(btJanelaVeneziana); //adiciona o bot�o no frame
		painel.add(btPortaVeneziana); //adiciona o bot�o no frame
		
		tela.add(painel);
		tela.setSize(500,500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
		
		//****A��o do Menu****//
		miSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//****A��o dos bot�es****//
		btJanelaCorrer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				new JanelaCorrer2F();
				CalcularJanelaCorrer2F janelaCorrer2FController = new CalcularJanelaCorrer2F();
				janelaCorrer2FController.show();
				
			}
		});
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Principal();
	
	}
	
}
