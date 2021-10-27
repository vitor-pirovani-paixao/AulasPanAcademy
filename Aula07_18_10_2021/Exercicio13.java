import java.util.ArrayList; 
public class Exercicio13 {

	public static void main(String[] args) {
		// 2. Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
		// 125}; A. Retorne somente com n�meros pares
		// B. Retorne somente com os n�meros �mpares * 2.
		
		int[] array = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares2 = new ArrayList<Integer>();
		
		for(int i : array) {
			if(i % 2 == 0) {
				pares.add(i);
			}else {
				impares2.add(i*2);
			}
		}
		System.out.println("Os n�meros pares s�o: " + pares.toString());
		System.out.println("Os n�meros �mpares x 2 s�o: " + impares2.toString());
		
	}

}
