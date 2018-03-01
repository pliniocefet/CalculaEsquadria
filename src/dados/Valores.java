package dados;

public class Valores {

	// Variaveis
	private final double VALOR_ALUMINIO = 23.00;
	private double valorTotalAcessoriosJanelaCorrer2F;
	private double valorVidro;
	private double pesoLargura = 3.466; // soma dos pesos dos perfis da largura por metro
	private double pesoAltura = 4.126; // soma dos pesos dos perfis da altura por metro
	
	// CONSTANTES
	private final double VALOR_FECHO = 6.00; 
	private final double VALOR_ROLDANA = 8.00; 
	private final double VALOR_GUIA_DESLIZANTE = 0.50; 
	private final double VALOR_CONTRA_FECHO = 1.00; 
	private final double INCOLOR6MM = 78.00;
	private final double INCOLOR8MM = 80.00;
	private final double INCOLOR10MM = 82.00;
	private final double FUME6MM = 84.00;
	private final double FUME8MM = 86.00;
	private final double FUME10MM = 88.00;
	private final double VERDE6MM = 90.00;
	private final double VERDE8MM = 92.00;
	private final double VERDE10MM = 94.00;
	
	public double getVALOR_FECHO() {
		return VALOR_FECHO;
	}
	
	public double getVALOR_ROLDANA() {
		return VALOR_ROLDANA;
	}
	
	public double getVALOR_GUIA_DESLIZANTE() {
		return VALOR_GUIA_DESLIZANTE;
	}
	
	public double getVALOR_CONTRA_FECHO() {
		return VALOR_CONTRA_FECHO;
	}
	
	public double getINCOLOR6MM() {
		return INCOLOR6MM;
	}
	
	public double getINCOLOR8MM() {
		return INCOLOR8MM;
	}

	public double getINCOLOR10MM() {
		return INCOLOR10MM;
	}

	public double getFUME6MM() {
		return FUME6MM;
	}

	public double getFUME8MM() {
		return FUME8MM;
	}

	public double getFUME10MM() {
		return FUME10MM;
	}

	public double getVERDE6MM() {
		return VERDE6MM;  
	}

	public double getVERDE8MM() {
		return VERDE8MM;
	}

	public double getVERDE10MM() {
		return VERDE10MM;
	}

	public double getVALOR_ALUMINIO() {
		return VALOR_ALUMINIO;
	}
	
	public double getValorTotalAcessoriosJanelaCorrer2F() {
		return valorTotalAcessoriosJanelaCorrer2F;
	}
	
	public void setValorTotalAcessoriosJanelaCorrer2F(
			double valorTotalAcessoriosJanelaCorrer2F) {
		this.valorTotalAcessoriosJanelaCorrer2F = valorTotalAcessoriosJanelaCorrer2F;
	}
	
	public double getValorVidro() {
		return valorVidro;
	}
	
	public void setValorVidro(double valorVidro) {
		this.valorVidro = valorVidro;
	}
	
	public double getPesoLargura() {
		return pesoLargura;
	}
	
	public void setPesoLargura(double pesoTotalLargura) {
		this.pesoLargura = pesoTotalLargura;
	}
	
	public double getPesoAltura() {
		return pesoAltura;
	}
	
	public void setPesoAltura(double pesoTotalAltura) {
		this.pesoAltura = pesoTotalAltura;
	}
	
}
