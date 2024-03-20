package pooatividade01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        
        int matriz[][] = new int[5][5];
        int i, j, x;
        boolean encontrado = false;
        
        System.out.println("Digite uma matriz 5x5 -- dê espaços e pule linhas conforme a ordem da matriz para facilitar a visualização:\n");
        
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                matriz[i][j] = scanf.nextInt();
            }
        }
        
        System.out.println("\nImpressão da matriz 5x5:\n");
        
         for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.print("\nDigite um valor X qualquer: ");
        x = scanf.nextInt();
                
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                if(matriz[i][j] == x) {
                    System.out.println("\nLinha: " + (i+1) + "\nColuna: " + (j+1));
                    encontrado = true;
                }
            }
        } 
        
        if(!encontrado) {
            System.out.println("X não encontrado na matriz.");
        }
    }
}