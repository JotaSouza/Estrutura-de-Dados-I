package SelectionSort;

public class Ordenacao {

    public static void main(String[] args) {
       int aux;
       int[] num = {23, 4, 33, 45, 19, 12, 28, 40};
       
       for(int x = 0; x < num.length; x ++){
           for(int y = 0; y < num.length; y++){
               if(num[x] < num[y]){
                   aux = num[x];
                   num[x] = num[y];
                   num[y] = aux;
               }
           }
       }
       for(int z = 0; z < num.length; z++)
       System.out.print(num[z]+" | ");
    }
    
}
