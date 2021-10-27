import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Faça um programa que receba três inteiros e diga qual deles é o 
		// maior e qual o menor. Conseguem criar mais de uma solução?
		System.out.println("Digite um número inteiro:");
		int a = sc.nextInt();
		System.out.println("Digite um número inteiro:");
		int b = sc.nextInt();
		System.out.println("Digite um número inteiro:");
		int c = sc.nextInt();
		
		if(a == b && a == c) {
			System.out.println("O três números são iguas a " + a);
		}else {
			if(a >= b && a >= c) {
				System.out.println("O valor do maior número é " + a);
			}else if (b >= a && b >= c) {
				System.out.println("O valor do maior número é " + b);
			}else {
				System.out.println("O valor do maior número é " + c);
			}
			if(a <= b && a <= c) {
				System.out.println("O valor do menor número é " + a);
			}else if (b <= a && b <= c) {
				System.out.println("O valor do menor número é " + b);
			}else {
				System.out.println("O valor do menor número é " + c);
			}
		}
		sc.close();
	}
}
