package Listas.ListaCircular;

public class TestaListaCircular {

	public static void main(String[] args) {
		int valor = 0;
		int erro = 0;
		
		ListaCircular lista = new ListaCircular();
		
		lista.criaListaCircular();
		for(int i = 1; i <= 10; i++){
			valor += i; 
			erro = lista.insereListaCircular(valor);
		}
				
		lista.consultaListaCircular();
		if(valor != 0){
			System.out.println("Primeiro da lista: " + valor);
		} else {
			System.out.println("Erro: Lista vazia!");
		}
		
		lista.exibeListaCircular();
		
		if(erro != 0);
		lista.imprimeErroCircular(erro);
		
		System.exit(0);
	}

}
