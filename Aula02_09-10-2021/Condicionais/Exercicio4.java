import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
		// A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		// A mensagem "Reprovado", se a m�dia for menor do que sete;
		// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a seguunda nota:");
		double nota2 = sc.nextDouble();		
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 7 && media < 10) {
			System.out.println("O aluno est� aprovado");
		}else if (media == 10) {
			System.out.println("Aluno aprovado com distin��o");
		}else {
			System.out.println("Aluno reprovado");
		}
		System.out.printf("A m�dia do aluno foi: %.2f",media);
		sc.close(); 
	}
}
