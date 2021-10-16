import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		// coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
		// a) média do salário da população;
		// b) média do número de filhos;
		// c) maior salário;
		// d) percentual de pessoas com salário até R$100,00.
		
		Scanner entrada = new Scanner(System.in);
		double[] salarios = new double[20];
		int[] filhos = new int [20];;
		for(int i = 0; i < 20; i++) {
			if(i == 0) {
				System.out.println("Digite o valor do primeiro salário:");
				salarios[i]=entrada.nextDouble();
				System.out.println("Digite o número de filhos correspondente:");
				filhos[i]=entrada.nextInt();
			}else {
				System.out.println("Digite o valor do próximo salário:");
				salarios[i]=entrada.nextDouble();
				System.out.println("Digite o número de filhos correspondente:");
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
		System.out.printf("A médio dos salários é R$ %.2f \n",total/20);
		
		for (double filho : filhos) {
			total_f=total_f + filho;
		}
		System.out.printf("A média de filhos é %.2f \n",total_f/20);
		
		System.out.printf("O maior salário é %.2f \n",maior);
		
		System.out.printf("O percentual de sários até R$ 100,00 é %.2f%% \n",contador*5.0);
	}

}
