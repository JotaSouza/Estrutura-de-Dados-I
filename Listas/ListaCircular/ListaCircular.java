package Listas.ListaCircular;

public class ListaCircular {

	final int SUCESSO = 0;
	final int LISTA_CHEIA = 1;
	final int LISTA_VAZIA = 3;
	private final int tam = 10;
	private int primeiro;
	private int tamanho;
	private int ultimo;
	private int[] elemento = new int[tam];
	
	// cria lista circular
	public void criaListaCircular(){
		this.primeiro= 0;
		this.tamanho = 0;
		this.ultimo = -1;	
	}
	
	// insere dados na lista circular
	public int insereListaCircular(int dado){
		if(tamanho == tam){
			return LISTA_CHEIA;
		} else {
			tamanho++;
			ultimo = (ultimo + 1) % tam; 
			elemento[ultimo] = dado;
			return SUCESSO;
		}		
	}
	
	//exclui dado da lista circular
	public int excluiListaCircular(){
		if(tamanho == 0){
			return LISTA_VAZIA;
		} else {
			System.out.println("Dado excluído: " + elemento[primeiro]);
			tamanho--;
			primeiro = (primeiro + 1) % tam;
			return SUCESSO;
		}
	}
	
	//consulta lista circular
	public int consultaListaCircular(){
		if(ultimo == -1){
			return 0;
		} else {
			return elemento[primeiro];
		}
	}
	
	//exibe lista circular
	public void exibeListaCircular(){
		int t = primeiro;
		
		System.out.println("Fila Circular: ");
		if(tamanho != 0){
			for(int i = 1; i <= tamanho; i++){
				System.out.println(elemento[t] + " ");
				t = (t+1) % tam;
			}
			System.out.println();
		}
	}
	
	//imprime erro na lista circular
	public void imprimeErroCircular(int erro){
		switch(erro){
			case LISTA_CHEIA:
				System.out.println("Erro: lista circular cheia");
				break;
			case LISTA_VAZIA:
				System.out.println("Erro: lista circular vazia");
				break;
		}
	}
}
