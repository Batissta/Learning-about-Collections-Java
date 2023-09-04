package setInterface.ordenacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtos;
	
	public CadastroProdutos() {
		produtos = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double valor, int quantidade) {
		produtos.add(new Produto(cod, nome, valor, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorOrdemAlfabetica = new TreeSet<>(produtos);
		return produtosPorOrdemAlfabetica;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosEmOrdemDePreco = new TreeSet<>(new ComparatorPorPreco());
		produtosEmOrdemDePreco.addAll(this.produtos);
		return produtosEmOrdemDePreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cp = new CadastroProdutos();
		System.out.println(cp.produtos);
		cp.adicionarProduto(4, "Melão", 2d, 60);
		cp.adicionarProduto(3, "Melancia", 2d, 30);
		cp.adicionarProduto(2, "Manga", 2d, 72);
		cp.adicionarProduto(5, "Morango", 2d, 500);
		cp.adicionarProduto(1, "Abacaxi", 2d, 30);
		System.out.println(cp.produtos);
		System.out.println(cp.exibirProdutosPorPreco());
		System.out.println(cp.exibirProdutosPorNome());
		
	}
}
