import java.util.Scanner;

public class EstruturaControle4 {

	public static void main(String[] args) {
//		Crie um programa que recebe 10 valores e ao final imprima o maior
//		n�mero.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero = entrada.nextInt();
		int maior = numero;
		
		for(int i = 0; i < 9; i++) {
			System.out.println("Digite outro n�mero:");
			numero = entrada.nextInt();
			maior = numero > maior? numero : maior;
		}
		System.out.println("O maior n�mero digitado foi " + maior);
		System.out.println("Fim!");
		entrada.close();

	}

}
