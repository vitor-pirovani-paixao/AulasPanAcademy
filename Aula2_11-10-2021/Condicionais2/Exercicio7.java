import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
		// Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��s foram compradas?");
		int n = sc.nextInt();
		sc.close();

		System.out.printf("O valor total da compra foi R$ %.2f",  n < 12 ? 0.3*n : 0.25*n);
	}
}
