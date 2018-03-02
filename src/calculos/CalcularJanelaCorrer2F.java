package calculos;

import gui.JanelaCorrer2F;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dados.AcessorioJanelaCorrer2F;
import dados.Valores;

public class CalcularJanelaCorrer2F implements ActionListener {
	JanelaCorrer2F janelaCorrer2F;	
	AcessorioJanelaCorrer2F acessorioJanelaCorrer2F;
	Valores valores;
	
	private double larguraConvertida;
	private double alturaConvertida;
	private int quantidadeConvertida;
	private double valorLarguraAluminio;
	private double valorAlturaAluminio;
	private double valorVidro;
	private double valorAluminio;
	
	
	public CalcularJanelaCorrer2F() {
		janelaCorrer2F = new JanelaCorrer2F(this);
		acessorioJanelaCorrer2F = new AcessorioJanelaCorrer2F();
		valores = new Valores();

		//Recebe e converte valores String de tfAltura e tfLargura para Double
//		larguraConvertida = Double.parseDouble(janelaCorrer2F.getTfLargura().getText());
//		alturaConvertida = Double.parseDouble(janelaCorrer2F.getTfAltura().getText());
//		quantidadeConvertida = Integer.parseInt(janelaCorrer2F.getTfQuantidade().getText());
	
	}
	
	public double calculaAcessorio() {
		//CALCULA VALOR TOTAL EM ACESS�RIOS DE ACORDO COM A QUANTIDADE INFORMADA
		
		if(quantidadeConvertida <= 0){
			
			quantidadeConvertida = 1;
	
			double fecho = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_FECHO() ) * ( valores.getVALOR_FECHO() ); 
			double contraFecho = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_CONTRAFECHO() ) * ( valores.getVALOR_CONTRA_FECHO() ); 
			double roldana = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_ROLDANA() ) * ( valores.getVALOR_ROLDANA() ); 
			double guiaDeslizante = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_GUIA_DESLIZANTE() * ( valores.getVALOR_GUIA_DESLIZANTE() ));
					
			double totalAcessorio = fecho + contraFecho + roldana + guiaDeslizante;
			
			return totalAcessorio;
			
					
		}else{
			
			double fecho = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_FECHO() ) * ( valores.getVALOR_FECHO() ); 
			double contraFecho = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_CONTRAFECHO() ) * ( valores.getVALOR_CONTRA_FECHO() ); 
			double roldana = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_ROLDANA() ) * ( valores.getVALOR_ROLDANA() ); 
			double guiaDeslizante = quantidadeConvertida * ( acessorioJanelaCorrer2F.getQUANTIDADE_GUIA_DESLIZANTE() * ( valores.getVALOR_GUIA_DESLIZANTE() ));
					
			double totalAcessorio = fecho + contraFecho + roldana + guiaDeslizante;
			
			return totalAcessorio;
			
			}
		
	}
	
	public double calculaAluminio() {
		/**
		 *recuperar valor de larguraConvertida----------ok
		 * recuperar valor de alturaConvertida----------ok
		 * multiplicar larguraConvertida por pesoLargura(dentro da classe Valores)-----ok
		 * multiplicar alturaConvertida por pesoAltura(dentro da classe Valores)-------ok
		 * 
		 * resultado da multiplica��o larguraConvertida por pesoLargura, multiplicar por pre�o do kg do aluminio -------ok
		 * resultado da multiplica��o alturaConvertida por pesoAltura, multiplicar por pre�o do kg do aluminio ---------ok
		 * 
		 * */
		
		valorLarguraAluminio = ( larguraConvertida * valores.getPesoLargura() ) * ( valores.getVALOR_ALUMINIO() );
		valorAlturaAluminio = ( alturaConvertida * valores.getPesoLargura() ) * ( valores.getVALOR_ALUMINIO() );
		
		valorAluminio = valorLarguraAluminio + valorAlturaAluminio;
		
		return valorAluminio;
		
	}
	
	public double calculaVidro() {
		//*** Para calcular as medidas dos vidros vou simplificar ***
		// Recuperar a larguraConvertida e multiplicar pela alturaConvertida
		// Depois multiplicar pelo valor do vidro escolhido pelo usu�rio
		//
		
		valorVidro = ( larguraConvertida * alturaConvertida ) * (janelaCorrer2F.recuperaValorVidro());
		
		return valorVidro;
	}
	
	public double calculaJanelaCorrer2F(){
		double acessorio;
		double aluminio;
		double vidro;
		double subtotalJanela;
		double totalJanela;

		acessorio = this.calculaAcessorio();
		aluminio = this.calculaAluminio();
		vidro = this.calculaVidro();
		
		subtotalJanela = (acessorio + aluminio + vidro) * quantidadeConvertida;
		
		// margem de lucro de 100%
		totalJanela = subtotalJanela + subtotalJanela;
		
		return totalJanela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("action :".concat(e.getSource().toString()));
		
	}
	
	public final void show() {
		janelaCorrer2F.exibir(true);
	}
	
}
