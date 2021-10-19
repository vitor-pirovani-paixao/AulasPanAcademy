import java.util.Scanner;

public class EstruturaControle4 {

	public static void main(String[] args) {
//		Crie um programa que recebe 10 valores e ao final imprima o maior
//		número.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		int maior = numero;
		
		for(int i = 0; i < 9; i++) {
			System.out.println("Digite outro número:");
			numero = entrada.nextInt();
			maior = numero > maior? numero : maior;
		}
		System.out.println("O maior número digitado foi " + maior);
		System.out.println("Fim!");
		entrada.close();

	}

}
