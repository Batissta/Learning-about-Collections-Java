package setInterface.ordenacaoEmSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private long cod;
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(long c, String n, double v, int q) {
		this.nome = n;
		this.cod = c;
		this.valor = v;
		this.quantidade = q;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(o.getNome());
	}
	
	@Override
	public String toString() {
		return "Produto "+
	"[codigo = "+cod+
	", nome = "+nome+
	", valor = "+valor+
	", quantidade = "+quantidade+"]\n";
	}

	public String getNome() {
		return nome;
	}

	public long getCod() {
		return cod;
	}

	public double getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getValor(), p2.getValor());
	}
	
}
