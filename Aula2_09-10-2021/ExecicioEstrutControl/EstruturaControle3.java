import java.util.Scanner;

public class EstruturaControle3 {

	public static void main(String[] args) {
//		Criar um programa que receba uma palavra e em seguida imprime no
//		console letra por letra.	

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String word = entrada.next();
		
		for(int i = 0 ; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		entrada.close();
	}

}
