package ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	List<Pessoa> listaDePessoas;
	
	public OrdenacaoPessoas() {
		listaDePessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
		Collections.sort(pessoasPorIdade, new ComparatorPorAltura());
		return pessoasPorIdade;
	}
	public void mostrarPessoasnaLista() {
		System.out.println(listaDePessoas);
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas pessoasList = new OrdenacaoPessoas();
		pessoasList.adicionarPessoa("Joãozinho", 20, 1.72);
		pessoasList.adicionarPessoa("Pablito", 19, 1.67);
		pessoasList.adicionarPessoa("Lucas", 18, 1.71);
		pessoasList.adicionarPessoa("Ademario", 18, 1.68);
		pessoasList.adicionarPessoa("Talles", 17, 1.75);
		pessoasList.adicionarPessoa("Francinaldo", 18, 1.74);
		System.out.println(pessoasList.listaDePessoas);
		System.out.println(pessoasList.ordenarPorIdade());
		System.out.println(pessoasList.ordenarPorAltura());
	}
}
