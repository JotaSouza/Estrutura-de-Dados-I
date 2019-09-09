package Recursividade.Exercicios;

public class BuscaBinariaRecursiva {

	static int BuscaBinaria(int vet[], int ini, int fim, int x) {
		int k;
		if(ini> fim)
			return -1;
		k = (ini + fim)/2;
		if(vet[k] == x)
			return k;
		if(vet[k] > x)
			return BuscaBinaria(vet, ini, k-1, x);
		if(vet[k] < x)
			return BuscaBinaria(vet, k+1, fim, x);
		return x;
	}
}

