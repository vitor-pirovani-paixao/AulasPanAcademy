
public class Aluno {
	
	private String nome;
	private double[] notas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	} 
	
	public void media() {
		double soma = 0;
		for(double nota: this.notas) {
			soma += nota;
		}
		System.out.println("A média do aluno "+ this.nome + " é " + (double)soma/notas.length);
	}
	
	public void aprovado() {
		double soma = 0;
		for(double nota: this.notas) {
			soma += nota;
		}
		double media = (double)soma/notas.length;
		if(media >= 7.0) {
			System.out.println("O aluno "+ this.nome + " está aprovado!");
		}else {
			System.out.println("O aluno "+ this.nome + " está reprovado!");
		}
		
	}
    
	public void maiorNota() {
		double maior = this.notas[0];
		for(double nota: this.notas) {
			maior = nota > maior? nota: maior;
		}
		System.out.println("A maior nota do aluno "+ this.nome + " foi " + maior);
	}	

}
