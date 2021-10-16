
public class TesteAnimal {

	public static void main(String[] args) {
		Mamifero boi = new Mamifero();
		Aves galinha = new Aves();
		
		boi.setCorDoPelo("Preto");
		boi.setDomestico(false);
		boi.setMesesGestacao(9);
		boi.setRaca("Nelore");
		boi.setVoa(false);
		
		System.out.println(boi.toString());
		boi.comunicar("berra");
		boi.movimentar("caminha e corre");
		
		galinha.setCorDaPena("carijó");
		galinha.setDomestico(false);
		galinha.setMesChocar(2);
		galinha.setRaca("caipira");
		galinha.setVoa(true);
		
		System.out.println(galinha.toString());
		galinha.comunicar("cacareja");
		galinha.movimentar("caminha, corre e voa");

	}

}
