
public class ImpostoRenda {

	public static void main(String[] args) {
		double salario = 4800;
		if(salario < 2500.0) {
			System.out.println("A sua al�quota � de 15%");
			System.out.println("Voc� pode deduzir ate R$ 350,00");
		}else if(salario >= 2500 && salario < 3800.0) {
			System.out.println("A sua al�quota � de 17%");
			System.out.println("Voc� pode deduzir at� R$ 430,00");
		}else {
			System.out.println("A sua al�quota � de 23%");
			System.out.println("Voc� pode deduzir at� R$ 630,00");
		}
	}

}


