package ListaSimplesEncadeada;

public class ContatoLista {

	private String nome;
	private long telefone;
	private String email;
	private ContatoLista proximo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContatoLista getProximo() {
		return proximo;
	}
	public void setProximo(ContatoLista proximo) {
		this.proximo = proximo;
	}
	
	
}
