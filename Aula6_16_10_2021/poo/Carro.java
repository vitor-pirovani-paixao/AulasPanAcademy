package poo;

public class Carro implements Controlador {
	public String cor;
	private boolean ligado;
	private String marca;
	private String placa;
	private int ano;
	private double velocidade;
	
	// Contrutor. Não é obrigatório, mas permite ao usuário 
	// configurar os atributos quando o objeto for criado. Ex para o ano
	public Carro(int ano) {
		this.ano= ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void acelerar() {
		setVelocidade(getVelocidade() + 5.0);		
	}
	
	
}
