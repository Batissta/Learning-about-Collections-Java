package setInterface.pesquisaSet;

public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String desc) {
		this.descricao = desc;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public boolean getConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	public String toString() {
		return String.format("(%s | Situação: %b)\n", this.descricao, this.concluida);
	}
	
}
