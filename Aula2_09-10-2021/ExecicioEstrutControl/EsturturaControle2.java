import java.util.Scanner;

public class EsturturaControle2 {

	public static void main(String[] args) {
//		Criar um programa que, enquanto estiver recebendo n�meros positivos,
//		imprime no console a soma dos n�meros inseridos, caso receba um
//		n�mero negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		int numero = 1;
		do {
			System.out.println("Digite um n�mero positivo para continuar ou negativo para sair:");
			numero = entrada.nextInt();
		}while(numero > 0);
		System.out.println("Fim!");
		entrada.close();

	}

}
