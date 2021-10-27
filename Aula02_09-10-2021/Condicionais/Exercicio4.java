import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
		// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		// A mensagem "Reprovado", se a média for menor do que sete;
		// A mensagem "Aprovado com Distinção", se a média for igual a dez.
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a seguunda nota:");
		double nota2 = sc.nextDouble();		
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 7 && media < 10) {
			System.out.println("O aluno está aprovado");
		}else if (media == 10) {
			System.out.println("Aluno aprovado com distinção");
		}else {
			System.out.println("Aluno reprovado");
		}
		System.out.printf("A média do aluno foi: %.2f",media);
		sc.close(); 
	}
}
