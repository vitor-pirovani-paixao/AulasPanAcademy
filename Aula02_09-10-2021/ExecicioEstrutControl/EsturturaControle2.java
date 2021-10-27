import java.util.Scanner;

public class EsturturaControle2 {

	public static void main(String[] args) {
//		Criar um programa que, enquanto estiver recebendo números positivos,
//		imprime no console a soma dos números inseridos, caso receba um
//		número negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		int numero = 1;
		do {
			System.out.println("Digite um número positivo para continuar ou negativo para sair:");
			numero = entrada.nextInt();
		}while(numero > 0);
		System.out.println("Fim!");
		entrada.close();

	}

}
