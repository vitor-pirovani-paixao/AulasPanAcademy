
public class Exercicio10 {

	public static void main(String[] args) {
		// 2- Fa�a um programa que mostre uma contagem na tela de 233 a 456, 
		// s� que contando de 3 em 3 quando estiver entre 300 e 400 e 
		// de 5 em 5 quando n�o estiver.
		for(int i = 233; i < 456;) {
			if(i <= 400) {
				System.out.println(i);
				i = i + 3;
			}else {
				System.out.println(i);
				i = i + 5;
				if( i == 456) {
					System.out.println(i);
				}
			}
		}

	}

}
