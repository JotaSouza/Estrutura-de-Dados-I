package TrabalhoFinal.Fila;

public class Arquivamento {

	private String nome;
	
	public Arquivamento(String nome){
		super();
		this.nome = nome;
	}
	
	public Arquivamento(){}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arquivamento [Nome do Processo=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
