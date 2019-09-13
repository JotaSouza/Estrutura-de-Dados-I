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
			System.out.println("Escolha uma op��o para prosseguir:");
			System.out.println("1 - Buscar um n�mero.");
			System.out.println("2 - Buscar uma String.");
			System.out.print("Op��o -> ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					
					System.out.print("Digite o n�mero a ser buscado no vetor: ");
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
						System.out.println("O valor foi encontrado no �ndice "+indice);
					}else {
						System.out.println("Valor n�o encontrado");
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
					System.out.println("A String foi encontrada no �ndice: "+indice);
				} else {
					System.out.println("String n�o encontrada");
					System.out.println(" ");
				}
				break;
				default:
					System.out.println("Op��o inv�lida");
					System.out.println(" ");
			}
			
		}while(!opcaoInvalida);
		
		entrada.close();
	}

}
