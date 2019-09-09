package Recursividade.Exercicios;

public class PotenciaRecursiva {

	int n;
	double x;
	
	static double Potencia(int n, double x) {
		if(n <= 1)
			return 1;
		else
			return (x * x) * (n-1);
		
	}
}
