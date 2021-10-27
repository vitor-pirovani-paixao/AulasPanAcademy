import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		// coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
		// a) m�dia do sal�rio da popula��o;
		// b) m�dia do n�mero de filhos;
		// c) maior sal�rio;
		// d) percentual de pessoas com sal�rio at� R$100,00.
		
		Scanner entrada = new Scanner(System.in);
		double[] salarios = new double[20];
		int[] filhos = new int [20];;
		for(int i = 0; i < 20; i++) {
			if(i == 0) {
				System.out.println("Digite o valor do primeiro sal�rio:");
				salarios[i]=entrada.nextDouble();
				System.out.println("Digite o n�mero de filhos correspondente:");
				filhos[i]=entrada.nextInt();
			}else {
				System.out.println("Digite o valor do pr�ximo sal�rio:");
				salarios[i]=entrada.nextDouble();
				System.out.println("Digite o n�mero de filhos correspondente:");
				filhos[i]=entrada.nextInt();
			}
		}
		
		entrada.close();
		
		//double[] salarios = {90,95,32,120,200,300,400,500,600,700,800,900,750,650,550,625,253,246,162,325};
		//int[] filhos = {0,1,2,3,0,1,2,3,0,1,2,3,2,2,1,1,1,1,1,2};
		double total=0;
		double total_f = 0;
		double maior = 0;
		int contador = 0;
		
		
		for (double salario : salarios) {
			total=total +salario;
			if(salario > maior) {
				maior=salario;
			}
			if(salario <= 100) {
				contador++;
			}
		}
		System.out.printf("A m�dio dos sal�rios � R$ %.2f \n",total/20);
		
		for (double filho : filhos) {
			total_f=total_f + filho;
		}
		System.out.printf("A m�dia de filhos � %.2f \n",total_f/20);
		
		System.out.printf("O maior sal�rio � %.2f \n",maior);
		
		System.out.printf("O percentual de s�rios at� R$ 100,00 � %.2f%% \n",contador*5.0);
	}

}
