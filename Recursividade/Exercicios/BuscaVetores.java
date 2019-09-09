package Recursividade.Exercicios;

public class BuscaVetores {
	
	 static int BuscaVetorMenor(int[] vetor, int ini, int fim) {
		if(ini == fim)
			return vetor[ini];
		else {
			int num1, num2;
			int meio;
			meio = (ini + fim)/2;
			num1 = BuscaVetorMenor(vetor, ini, meio);
			num2 = BuscaVetorMenor(vetor, meio + 1, fim);
			
			if(num1<num2)
				return num1;
			else
				return num2;
		}
	}
	 static int BuscaVetorMaior(int[] vetor, int ini, int fim) {
			if(ini == fim)
				return vetor[ini];
			else {
				int num1, num2;
				int meio;
				meio = (ini + fim)/2;
				num1 = BuscaVetorMaior(vetor, ini, meio);
				num2 = BuscaVetorMaior(vetor, meio + 1, fim);
				
				if(num1>num2)
					return num1;
				else
					return num2;
			}
		}
}
