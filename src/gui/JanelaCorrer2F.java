package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import calculos.CalcularJanelaCorrer2F;
import dados.Valores;

public class JanelaCorrer2F extends JFrame{
	
	JFrame tela;
	JLabel lbLargura;
	JLabel lbAltura;
	JLabel lbTextoApresentacao;
	JLabel lbQuantidade;
	JLabel lbVidro;
	JLabel lbSubtotal;
	JLabel lbTotal;
	JLabel lbResultSubtotal;
	JLabel lbResultTotal;
	JLabel lbJateado;
	JTextField tfLargura;
	JTextField tfAltura;
	JTextField tfQuantidade;
	JComboBox<String> cbListaVidros;
	JCheckBox chbJateado;
	JButton btCalcular;  
	JButton btGravar;
	JButton btLimpar;
	
	Valores tipoVidro;
	
	public JComboBox<String> getCbListaVidros() {
		return cbListaVidros;
	}

	public void setCbListaVidros(JComboBox<String> cbListaVidros) {
		this.cbListaVidros = cbListaVidros;
	}

	public JTextField getTfLargura() {
		return tfLargura;
	}
	
	public JTextField getTfAltura() {
		return tfAltura;
	}
	
	public JTextField getTfQuantidade() {
		return tfQuantidade;
	}
	
	public JLabel getLbSubtotal() {
		return lbSubtotal;
	}

	public void setLbSubtotal(JLabel lbSubtotal) {
		this.lbSubtotal = lbSubtotal;
	}

	public JLabel getLbTotal() {
		return lbTotal;
	}

	public void setLbTotal(JLabel lbTotal) {
		this.lbTotal = lbTotal;
	}

	public JLabel getLbResultSubtotal() {
		return lbResultSubtotal;
	}

	public void setLbResultSubtotal(JLabel lbResultSubtotal) {
		this.lbResultSubtotal = lbResultSubtotal;
	}

	public JLabel getLbResultTotal() {
		return lbResultTotal;
	}

	public void setLbResultTotal(JLabel lbResultTotal) {
		this.lbResultTotal = lbResultTotal;
	}

	public JanelaCorrer2F() {
		tela = new JFrame("Janela de Correr 2 Folhas com vidro"); 
		tela.setLayout(null); //seta o layout do painel como nulo
		
		//Instancia dos componentes
		lbTextoApresentacao = new JLabel("CALCULAR JANELA DE CORRER 2 FOLHAS COM VIDRO");
		lbLargura =  new JLabel("Largura (mm):");
		lbAltura =  new JLabel("Altura (mm):");
		lbQuantidade =  new JLabel("Quantidade:");
		lbVidro = new JLabel("Vidro:");
		lbSubtotal = new JLabel("Subtotal:   R$" );
		lbResultSubtotal = new JLabel(" 1");
		lbTotal = new JLabel("Total:   R$");
		lbResultTotal = new JLabel("1");
		lbJateado = new JLabel("Jateado:");
		chbJateado = new JCheckBox();
		tfAltura = new JTextField();
		tfLargura = new JTextField();
		tfQuantidade = new JTextField("1");
		btCalcular = new JButton("Calcular");
		btGravar = new JButton("Gravar");
		btLimpar = new JButton("Limpar");
		
		tipoVidro = new Valores();
		
		//preenche combobox de vidros
		cbListaVidros = new JComboBox<>();
			cbListaVidros.addItem("Selecione...");
			cbListaVidros.addItem("Incolor 6mm");
			cbListaVidros.addItem("Incolor 8mm");
			cbListaVidros.addItem("fume 6mm");
			cbListaVidros.addItem("fume 8mm");
			cbListaVidros.addItem("verde 6mm");
			cbListaVidros.addItem("verde 8mm");
		
		//posição dos componentes
		lbTextoApresentacao.setBounds(100, 10, 500, 15);
		lbLargura.setBounds(20, 50, 90, 15);
		lbAltura.setBounds(20, 80, 90, 15);
		tfLargura.setBounds(110, 45, 40, 20);
		tfAltura.setBounds(110, 75, 40, 20);
		tfQuantidade.setBounds(110, 105, 40, 20);
		lbQuantidade.setBounds(20, 105, 80, 20);
		lbSubtotal.setBounds(40, 135, 80, 20);
		lbResultSubtotal.setBounds(120, 135, 80, 20);
		lbTotal.setBounds(60, 165, 80, 20);
		lbResultTotal.setBounds(120, 165, 80, 20);
		lbJateado.setBounds(180, 80, 80, 20);
		chbJateado.setBounds(230, 80, 90, 20);
		
		//coluna da esquerda
		lbVidro.setBounds(180, 50, 80, 20);
		cbListaVidros.setBounds(220, 50, 100, 20);
		
		//botões
		btCalcular.setBounds(20, 195, 90, 20);
		btGravar.setBounds(120, 195, 90, 20);
		btLimpar.setBounds(220, 195, 90, 20);
		
		
		//Adiciona os componentes na tela
		tela.add(lbTextoApresentacao);
		tela.add(lbLargura);
		tela.add(tfLargura);
		tela.add(lbAltura);
		tela.add(tfAltura);
		tela.add(lbQuantidade);
		tela.add(tfQuantidade);
		tela.add(btCalcular);
		tela.add(btGravar);
		tela.add(btLimpar);
		tela.add(lbSubtotal);
		tela.add(lbResultSubtotal);
		tela.add(lbTotal);
		tela.add(lbResultTotal);
		tela.add(cbListaVidros);
		tela.add(lbVidro);
		tela.add(lbJateado);
		tela.add(chbJateado);
		
	
		//Configuração
		tela.setSize(500, 500);//Configura tamanho da tela
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fecha a aplicação ao clicar no X
		tela.setLocationRelativeTo(null);//Configura localização da tela no centro
		tela.setVisible(true);
		
		btLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfLargura.setText("");
				tfAltura.setText("");
				tfQuantidade.setText("1");
				lbResultSubtotal.setText("");
				lbResultTotal.setText("");
				cbListaVidros.setSelectedIndex(0);
				chbJateado.setSelected(false);
			}
		});
		
		btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
	
	public double recuperaValorVidro(){
		// recupera o tipo do vidro selecionado pelo usuario
		// vincula o tipo selecionado com o valor correspondente da classe Valores
		double vidroSelecionado;
		switch (cbListaVidros.getSelectedIndex()) {
		case 0:
			vidroSelecionado = tipoVidro.getINCOLOR6MM();
			break;
			
		case 1:
			vidroSelecionado = tipoVidro.getINCOLOR6MM();
			break;
			
		case 2:
			vidroSelecionado = tipoVidro.getINCOLOR8MM();
			break;
			
		case 3:
			vidroSelecionado = tipoVidro.getFUME6MM();
			break;
			
		case 4:
			vidroSelecionado = tipoVidro.getFUME8MM();
			break;
			
		case 5:
			vidroSelecionado = tipoVidro.getVERDE6MM();
			break;
			
		case 6:
			vidroSelecionado = tipoVidro.getVERDE8MM();
			break;

		default:
			vidroSelecionado = tipoVidro.getINCOLOR6MM();
			break;
			
		}
		
		return vidroSelecionado;
		
	}
	
}
