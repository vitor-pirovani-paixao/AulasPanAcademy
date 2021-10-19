
public class TesteAluno {

	public static void main(String[] args) {
		double[] notas = {10,5,7,9,10};
		Aluno aluno = new Aluno();
		aluno.setNome("Vitor");
		aluno.setNotas(notas);
		
		aluno.media();
		aluno.aprovado();
		aluno.maiorNota();

	}

}
