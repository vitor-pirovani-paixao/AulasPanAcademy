import java.util.Random;
import java.util.Scanner;
public class EstruturaControle1 {

	public static void main(String[] args) {
//      Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
//		Armazene um número aleatório em uma variável. O jogador tem 10
//		tentativas para adivinhar o número gerado. Ao final de cada tentativa,
//		imprima a quantidade de tentativas restantes, e imprima se o número
//		inserido é maior ou menor do que o número armazenado
		
		Scanner entrada = new Scanner(System.in);
		
		Random numero = new Random();
		int valorCorreto = numero.nextInt(101);
		
		int k = 1;
		System.out.println("Digite um número inteiro entre 0 e 100:");
		int resposta = entrada.nextInt();
		
		while(resposta != valorCorreto && k < 10) {
			System.out.println("Você errou! Digite outro número:");
			resposta = entrada.nextInt();
			k++;
		}
		
		if(resposta == valorCorreto) {
			System.out.println("Parabéns! Você acertou! O número correto é " + valorCorreto);
		}else {
			System.out.println("Você excedeu o número máximo de 10 tentativas.");
			System.out.println("O número correto era " + valorCorreto);
			System.out.println("Reinicie o programa para jogar novamente.");
		}
		
		
		entrada.close();
	}

}
