package pooatividade01;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i, j, k;
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        
        System.out.println("Insira os valores da matriz A (3x3):\n");
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("\nInsira os valores da matriz B (3x3):\n");
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                for(k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        System.out.println("\nMultiplicação da matriz A e B de mesma ordem:\n");
        
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.printf("%d ", C[i][j]);
            }
            System.out.println();
        }
    }
}