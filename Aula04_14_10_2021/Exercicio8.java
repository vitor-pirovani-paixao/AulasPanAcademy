import java.util.Scanner;

public class Exercico8 {

	public static void main(String[] args) {
		//Calcular m�dia de X alunos.
		//Notas v�lidas: entre 0 e 10
		//Contar quantas notas v�lidas foram digitadas
		//Usu�rio deve digitar -1 para sair do programa e ser informado da sua m�dia e quantidade de notas
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		
		int n = 0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota ou -1 para sair:");
			nota = entrada.nextDouble();
		
			if(nota >= 0 && nota <= 10) {
				n++;
				total = total + nota;
			}else if(nota ==-1) {
				System.out.println("A qunatidade de notas v�lidas digitadas foi: "+ n);
				System.out.printf("A m�dia � %.2f",total/n);
			}else {
				System.out.println("Nota inv�lida. Por favor, digite uma nota entre 0.0 e 10.0");
			}
		}
		entrada.close();
	}

}
