package Recursividade.Exercicios;

public class Serie2Recursiva {

	
	static double CalculaSerie(int n) {
		if(n == 1)
			return 1;
		else
			return (double)1+(1/(n + CalculaSerie(n-1)));
			
	}
}
