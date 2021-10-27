import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever 
		// uma mensagem que diga se ela poderá ou não votar este ano (não	é	necessário	
		// considerar	o	mês	em	que	ela nasceu).
		System.out.println("Informe o ano do seu nascimento:");
		int anoNascimento = sc.nextInt();
				
		if (anoNascimento <= 2005) {
			System.out.println("Você já pode votar!");
		}else {
			System.out.println("Você ainda não pode votar!");
		}
		sc.close();
	}

}
