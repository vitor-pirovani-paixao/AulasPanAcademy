
public class Exercicio12 {

	public static void main(String[] args) {
		//1. Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		//A. Retorno o valor total da soma de todos os elementos com foreach
		//B. Retorne a m�dia de todos os elementos
		//C. Retorne o maior valor e o menor elemento
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0;
		int menor = array[0];
		int maior = 0;
		
		for(int valor:array) {
			soma += valor;
			
            menor = menor > valor ? valor: menor;
            
			if(valor>maior) {
				maior=valor;
			}
		}
		System.out.println("A soma de todos os valores � " + soma);
		System.out.println("O menor valor � " + menor + " e o maior � " + maior);
		System.out.printf("O valor da m�dia � %.2f",soma/(double)array.length);

	}

}
