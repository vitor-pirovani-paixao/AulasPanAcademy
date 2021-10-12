import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//1)	Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
		//	− Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
		//	− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
		//	− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro ângulo em graus:");
		double a = sc.nextDouble();
		System.out.println("Digite o valor do segundo ângulo em graus:");
		double b = sc.nextDouble();
		System.out.println("Digite o valor do terceiro ângulo em graus:");
		double c = sc.nextDouble();
		
		double soma= a +b + c;
		
		if (soma != 180) {
			System.out.println("A soma dos ângulos deve ser igual a 180. Não é um triângulo!");
		}else if(a < 90 && b < 90 && c < 90) {
			System.out.println("É um triângulo acutângulo!");
		}else if( a == 90 || b == 90 || b == 90) {
			System.out.println("É um triângulo retângulo!");
		}else {
			System.out.println("É um triângulo obtusângulo!");
		}
		sc.close();
	}

}
