package list.carrinhodeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	List<Item> produtos; 
	
	public CarrinhoDeCompras() {
		produtos = new ArrayList<>();
	}
	public void adicionarItem(String nome, double valor, int quantidade) {
		produtos.add(new Item(nome, valor, quantidade));
	}
	public void removerItem(String nome) {
		List<Item> produtosaRemover = new ArrayList<>();
		for (Item item : produtosaRemover) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				produtosaRemover.add(item);
			}
		}
		produtos.removeAll(produtosaRemover);
	}
	public double calcularValor() {
		double soma = 0;
		for (Item item : produtos) {
			soma += (item.getValor()*item.getQuantidade());
		}
		return soma;
	}
	public void exibirItens() {
		System.out.println(produtos);
	}
	public static void main(String[] args) {
		CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
		novoCarrinho.adicionarItem("Impressora 3D", 128.0, 1);
		novoCarrinho.adicionarItem("Monitor Razer", 369.99, 1);
		novoCarrinho.adicionarItem("Creatina Growth", 78.5, 4);
		novoCarrinho.adicionarItem("Par de aneis de prata 18mm e 12mm", 250, 1);
		novoCarrinho.adicionarItem("Notebook 16gb Ram", 3250.5, 1);
		novoCarrinho.exibirItens();
		System.out.println("O seu carrinho está com R$"+novoCarrinho.calcularValor()+ " em itens.");
	}
}
