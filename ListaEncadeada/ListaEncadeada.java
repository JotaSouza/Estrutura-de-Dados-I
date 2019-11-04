package ListaEncadeada;

public class ListaEncadeada {

	private Nodo primeiro = null;
	private Nodo ultimo = null;
	
	//insere dados na lista
	public void inserirLista(String nome, String email, long telefone){
		Nodo contato = new Nodo();
		
		contato.nome = nome;
		contato.email = email;
		contato.telefone = telefone;
		
		if(primeiro == null){
			primeiro = contato;
		}else{
			ultimo.elo = contato;
		}
		ultimo = contato;
	}
	
	//remove dado da lista
	public String removerLista(){
		Nodo contato, tmp;
		
		contato = tmp = primeiro;
		
		if(contato != null){
			primeiro = contato.elo;
			if(primeiro == null){
				ultimo = null;
			}
			return tmp.nome;
		}else
			return "";
	}
	
	//consulta dado na lista
	public String consultaLista(){
		Nodo contato;
		String nome;
		
		contato = primeiro;
		
		if(contato != null){
			if(contato == primeiro){
				return primeiro.nome;
			}
		}
		return "";
	}
	
	//apresenta todos os dados da lista
	public void imprimirLista(){
		Nodo contato;
		
		contato = primeiro;
		
		System.out.println("Lista de contatos: ");
		if(contato != null){
			while(contato != null){
				System.out.println("Nome: " + contato.nome + " ");
				System.out.println("Email: " + contato.email + " ");
				System.out.println("Telefone: " + contato.telefone + " ");
				contato = contato.elo;
			}
		} else {
			System.out.println("Lista está vazia");
		}
		System.out.println();
	}
}
