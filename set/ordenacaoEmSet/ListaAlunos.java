package setInterface.ordenacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
	Set<Aluno> alunosMatriculados;
	
	
	public ListaAlunos() {
		alunosMatriculados = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunosMatriculados.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno removerMatricula = null;
		for (Aluno aluno : alunosMatriculados) {
			if (aluno.getMatricula()==matricula) {
				removerMatricula = aluno;
				alunosMatriculados.remove(removerMatricula);
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunosMatriculados);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNome = new TreeSet<>(new ComparaPorNota());
		alunosPorNome.addAll(alunosMatriculados);
		return alunosPorNome;
	}
	
}
