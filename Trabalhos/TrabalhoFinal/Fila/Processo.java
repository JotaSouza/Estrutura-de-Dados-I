package TrabalhoFinal.Fila;

public class Processo implements Comparable<Processo> {

	private String nome;
	private int prioridade;
	
	public Processo(String nome, int prioridade){
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	public Processo() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public int compareTo(Processo p){
		if(this.prioridade > p.getPrioridade()){
			return 1;
		} else if(this.prioridade < p.getPrioridade()){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processo [nome: ");
		builder.append(nome);
		builder.append(", prioridade: ");
		builder.append(prioridade);
		builder.append("]");
		return builder.toString();
	}
	
}
