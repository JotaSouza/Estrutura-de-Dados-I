package SelectionSort.Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class CrescenteString {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TAM;

         System.out.println("--- Ordena Vetor String (crescente) ---");
         System.out.print("Informe o tamanho do vetor: ");
         TAM = input.nextInt();
         String[] nomes = new String[TAM];
         
         for(int i = 0; i < nomes.length; i++){
             System.out.print("Digite uma palavra: ");
             nomes[i] = input.next();
         }
         Arrays.sort(nomes);
         for (String nome : nomes) {
             System.out.print(nome + " | ");
         }
         
         input.close();
    }
    
}
