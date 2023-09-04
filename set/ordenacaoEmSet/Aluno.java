package setInterface.ordenacaoEmSet;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return String.format("%s - Matrícula: %d\n", this.nome, this.matricula);
	}
	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareToIgnoreCase(o.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

}
class ComparaPorNota implements Comparator<Aluno>{
	@Override
	public int compare(Aluno o1, Aluno o2) {
		return Double.compare(o1.getNota(), o2.getNota());
	}
	
}
