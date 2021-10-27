
public class ImpostoRenda {

	public static void main(String[] args) {
		double salario = 4800;
		if(salario < 2500.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir ate R$ 350,00");
		}else if(salario >= 2500 && salario < 3800.0) {
			System.out.println("A sua alíquota é de 17%");
			System.out.println("Você pode deduzir até R$ 430,00");
		}else {
			System.out.println("A sua alíquota é de 23%");
			System.out.println("Você pode deduzir até R$ 630,00");
		}
	}

}


