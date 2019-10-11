package Listas.ListaSimples;

public class OperacoesListas {

	private static Nodo inicio  = null;
	private static Nodo fim = null;
	private static Nodo aux = null;
	private Nodo anterior = null;
	
	public String inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.numero = num;
		String t = "Valor inserido com sucesso!";
		
		if(inicio == null){
			//se a lista estiver vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			novo.prox = null;
		} else {
			//se a lista conter elementos, o novo elemento será inserido no inicio da lista
			novo.prox = inicio;
			inicio = novo;
		}
		return t;
	}
	
	public void mostraLista(){
		if(inicio == null){
			System.out.println("A lista está vazia");
		} else {
			System.out.println("Mostrando a lista:");
			aux = inicio;
			while(aux != null){
				System.out.println("Numero: " + aux.numero + ";");
				aux = aux.prox;
			}
		}
	}
	
	public void inserirNoFim(int num){
		Nodo novo = new Nodo();
		novo.numero = num;
		
		if(inicio == null){
			//Se verdadeiro, inicio e fim recebem  o elemento
			inicio = novo;
			fim = novo;
			novo.prox = null;
		} else {
			//Se não, o novo elemento será inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
	}
	
	public void removerNodo(int num){
		int ocorrencias = 0;
		if(inicio == null){
			System.out.println("Lista Vazia");
		} else {
			aux = inicio;
			anterior = null;
			while (aux != null) {
				if (aux.numero == num){
					ocorrencias++;
					if(aux == inicio){
						inicio = aux.prox;
					} else if(aux == fim){
						anterior.prox = null;
						fim = anterior;
						aux = null;
					} else {
						anterior.prox = aux.prox;
						aux = aux.prox;
					}
				} else {
					anterior = aux;
					aux = aux.prox;
				}
			}
		}
		if (ocorrencias == 0){
			System.out.println("Número não encontrado.");
		} else {
			System.out.println("Removidos "+ocorrencias+" números "+num+".");
		}
	}
	
	public int contarNodos(){
		int ocorrencias = 0;
		if(inicio != null){
			aux = inicio;
			ocorrencias++;
			while(aux.prox != null){
				aux = aux.prox;
				ocorrencias++;
			}
		}
		return ocorrencias;
	}
	
	public int calculaAltura(int posicao){
		int indice = 0;
		if(inicio != null){
			aux= inicio;
			while(aux.prox != null && indice != posicao){
				aux = aux.prox;
				indice++;
			}
		}
		int tamanho = contarNodos()-indice;
		return tamanho<0?0:tamanho;
	}
}
