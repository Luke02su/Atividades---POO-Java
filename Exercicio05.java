package pooatividade01;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i, maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE, menorP=0, maiorP=0;
        int vetor[] = new int[15];
        
        System.out.println("Digite 15 vetores:\n");
                
        for(i = 0; i < 15; i++) {
            System.out.print(i+1 + "º posição: ");
            vetor[i] = scan.nextInt();
            if(vetor[i] > maior) {
                maior = vetor[i];
                maiorP = i+1;
            } 
            if (vetor[i] < menor) {
                menor = vetor[i];
                menorP = i+1;
            }
        }
        
        System.out.println("\nMaior vetor: " + maior + "\nPosição: " + maiorP);
        System.out.println("Menor vetor: " + menor + "\nPosição: " + menorP);
    }
}