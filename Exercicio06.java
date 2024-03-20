package pooatividade01;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i;
        int vetor[] = new int[20];
        
        System.out.println("Multiplicação de números inteiros pelos seus indíces:\n");
                
        for(i = 0; i < 20; i++) {
            System.out.print(i+1 + "° número: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println();
        for(i = 0; i < 20; i++) {
            System.out.printf("%d x %d = %d\n", vetor[i], i+1, vetor[i] * (i+1)); 
        }
    }
    
}
