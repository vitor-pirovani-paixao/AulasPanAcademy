package Collections;

import java.util.Objects;

public class Usuario {

	String nome;
	
	

	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public String comprimentar() {
		return "Ol� ";
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meu nome � " + nome;
	}
	
	
}
