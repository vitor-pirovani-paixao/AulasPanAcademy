import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 2)	Faça um  algoritmo que escreva as seguintes mensagens :
		// − Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
		// − Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de lados do elemento:");
		int lados = sc.nextInt();
		
		if(lados < 3) {
			System.out.println("Não é um polígono!");
		}else if(lados == 3) {
			System.out.println("É um triângulo!");
		}else if(lados == 4) {
			System.out.println("É um quadrado!");
		}else if(lados == 5) {
			System.out.println("É um pentágono!");
		}else {
			System.out.println("Polígono não identificado!");
		}
		
		sc.close();

	}

}
