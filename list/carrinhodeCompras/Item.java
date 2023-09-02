package list.carrinhodeCompras;

public class Item {
	private String nome;
	private double valor;
	private int quantidade;
	
	public Item(String n, double v, int q) {
		this.nome = n;
		this.valor = v;
		this.quantidade = q;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	@Override
	public String toString() {
		String info = String.format("( %s | Valor: R$%.2f ) -> %d unidades.\n", nome, valor, quantidade);
		return info;
	}
}
