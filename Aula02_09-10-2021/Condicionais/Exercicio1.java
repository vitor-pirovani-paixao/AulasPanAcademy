import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o 
		// maior e qual o menor. Conseguem criar mais de uma solu��o?
		System.out.println("Digite um n�mero inteiro:");
		int a = sc.nextInt();
		System.out.println("Digite um n�mero inteiro:");
		int b = sc.nextInt();
		System.out.println("Digite um n�mero inteiro:");
		int c = sc.nextInt();
		
		if(a == b && a == c) {
			System.out.println("O tr�s n�meros s�o iguas a " + a);
		}else {
			if(a >= b && a >= c) {
				System.out.println("O valor do maior n�mero � " + a);
			}else if (b >= a && b >= c) {
				System.out.println("O valor do maior n�mero � " + b);
			}else {
				System.out.println("O valor do maior n�mero � " + c);
			}
			if(a <= b && a <= c) {
				System.out.println("O valor do menor n�mero � " + a);
			}else if (b <= a && b <= c) {
				System.out.println("O valor do menor n�mero � " + b);
			}else {
				System.out.println("O valor do menor n�mero � " + c);
			}
		}
		sc.close();
	}
}
