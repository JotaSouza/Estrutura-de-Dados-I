package BuscaBinaria.Exercicios;
import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] vetString = {"M","C","P","A"};
		int[] vetInteiros = {0,1,2,3,4,5,6,7,8,9};
		boolean opcaoInvalida = false;
		int opcao = 0;
		
		do {
			System.out.println("Escolha uma opção para prosseguir:");
			System.out.println("1 - Buscar um número.");
			System.out.println("2 - Buscar uma String.");
			System.out.print("Opção -> ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o número a ser buscado no vetor: ");
					int numero = entrada.nextInt();
					boolean retorno = false;
					int indice = 0;
					int inicio = 0;
					int fim = vetInteiros.length - 1;
					int meio;
					
					while(inicio <= fim) {
						meio = (inicio + fim) / 2;
						if(numero == vetInteiros[meio]) {
							retorno = true;
							indice = numero;
						} else if(numero < vetInteiros[meio]) {
							fim = meio - 1;
						} else {
							inicio = meio + 1;
						}
					}
					if(retorno == true) {
						opcaoInvalida = true;
						System.out.println("O valor foi encontrado no índice "+ indice);
					}else {
						System.out.println("Valor não encontrado");
						System.out.println(" ");
					}
					break;
					
				case 2:
					System.out.print("Informe a String a ser buscada no vetor: ");
					String texto = entrada.nextLine();
					retorno = false;
					indice = 0;
					int ini = 0;
					int fi = vetString.length - 1;
					int mei;
					
					while(ini <= fi) {
						mei = (ini + fi) / 2;
						if(texto.equalsIgnoreCase(vetString[mei])) {
							retorno = true;
							indice = mei;
						} else if(texto.equalsIgnoreCase(vetString[mei])) {
							fim = mei - 1;
						} else {
							inicio = mei + 1;
						}
					}
					if(retorno == true) {
						opcaoInvalida = true;
						System.out.println("A String foi encontrada no índice: "+indice);
					} else {
						System.out.println("String não encontrada");
						System.out.println(" ");
					}
					break;
					
					default:
						System.out.println("Opção inválida");
						System.out.println(" ");
					
				
			}
			
		} while(!opcaoInvalida);
		
		entrada.close();
	}

}
