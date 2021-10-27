package poo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro = new Carro(2015);
		carro.cor  = "preto";
		System.out.println("O carro é "+ carro.cor);
		
		carro.setPlaca("ABC-0000");
		
		System.out.println("A placa do carro é "+ carro.getPlaca());
		
		carro.acelerar();
		carro.acelerar();
		System.out.println("A velocidade atual do carro é "+ carro.getVelocidade());
		
		

	}

}
