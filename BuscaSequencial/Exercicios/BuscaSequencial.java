package BuscaSequencial.Exercicios;
import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] vetString = {"Maria","Carlos","Paulo","Amanda"};
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
					
					for(int i = 0; i < vetInteiros.length; i++) {
						if(vetInteiros[i] == numero) {
							retorno = true;
							indice = i;
						}
					}
					
					if(retorno == true) {
						opcaoInvalida = true;
						System.out.println("O valor foi encontrado no índice "+indice);
					}else {
						System.out.println("Valor não encontrado");
						System.out.println(" ");
					}
				 
				break;
			case 2:
				
				System.out.print("Informe a String a ser buscada no vetor: ");
				String texto = entrada.next();
				retorno = false;
				indice = 0;
				
				for(int i = 0; i < vetString.length; i++) {
					if(texto.equalsIgnoreCase(vetString[i])) {
						retorno = true;
						indice = i;
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
			
		}while(!opcaoInvalida);
		
		entrada.close();
	}

}
