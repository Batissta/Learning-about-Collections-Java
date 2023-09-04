package setInterface.pesquisaSet;

import java.util.Objects;

public class Contato {
	private String nome;
	private int numeroDeTelefone;
	
	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numeroDeTelefone = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDeTelefone() {
		return numeroDeTelefone;
	}
	public void setNumeroDeTelefone(int novoNumero) {
		this.numeroDeTelefone = novoNumero;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numeroDeTelefone=" + numeroDeTelefone + "]\n";
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
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

	
	
	
}
