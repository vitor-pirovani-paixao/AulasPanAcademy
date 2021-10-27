
public class Mamifero extends Animal {

		private String corDoPelo;
		private int mesesGestacao;
		
		
		
		public String getCorDoPelo() {
			return corDoPelo;
		}

		public void setCorDoPelo(String corDoPelo) {
			this.corDoPelo = corDoPelo;
		}

		public int getMesesGestacao() {
			return mesesGestacao;
		}

		public void setMesesGestacao(int mesesGestacao) {
			this.mesesGestacao = mesesGestacao;
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
			return "Mamifero [corDoPelo = " + corDoPelo + ", mesesGestacao = " + mesesGestacao + 
					", Raça = " + getRaca()+ ", Voa = " + isVoa()+ ", Doméstico = " + isDomestico() + "]";
		};
		
		
		
}
