package Recursividade.Exercicios;
import java.util.Scanner;

public class TestePotenciaRecursiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número real: ");
		double nReal = input.nextDouble();
		System.out.print("Digite um número inteiro: ");
		int nInteiro = input.nextInt();
		
		System.out.println("O resultado da potenciação do número Real pelo Inteiro é: "+ PotenciaRecursiva.Potencia(nInteiro, nReal));

		input.close();
	}

}
