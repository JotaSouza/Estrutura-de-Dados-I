package Recursividade.Exercicios;
import java.util.Scanner;

public class TestePotenciaRecursiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real: ");
		double nReal = input.nextDouble();
		System.out.print("Digite um n�mero inteiro: ");
		int nInteiro = input.nextInt();
		
		System.out.println("O resultado da potencia��o do n�mero Real pelo Inteiro �: "+ PotenciaRecursiva.Potencia(nInteiro, nReal));

		input.close();
	}

}
