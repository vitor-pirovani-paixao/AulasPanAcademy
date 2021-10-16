
public abstract class Animal {
	private String raca;
	private boolean voa;
	private boolean domestico;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public boolean isVoa() {
		return voa;
	}
	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	public boolean isDomestico() {
		return domestico;
	}
	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	
	public abstract void comunicar(String modoComunicar);
	
	public abstract void movimentar(String modoLocomover);
	
	

}
