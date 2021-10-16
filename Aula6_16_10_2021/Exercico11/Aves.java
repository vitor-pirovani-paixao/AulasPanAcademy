
public class Aves extends Animal {
	
	private String corDaPena;
	private int mesChocar;
	
	public String getCorDaPena() {
		return corDaPena;
	}
	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}
	public int getMesChocar() {
		return mesChocar;
	}
	public void setMesChocar(int mesChocar) {
		this.mesChocar = mesChocar;
	}
	
	@Override
	public void comunicar(String modoComunicar) {
		System.out.println("Este animal "+ modoComunicar + "!");
	};
	
	@Override
	public void movimentar(String modoLocomover) {
		System.out.println("Este animal " + modoLocomover + "!");
	}
	
	@Override
	public String toString() {
		return "Aves [corDaPena = " + corDaPena + ", mesChocar = " + mesChocar + 
	", Raça = " + getRaca()+ ", Voa = " + isVoa()+ ", Doméstico = " + isDomestico() + "]";
	};
	
	

}
