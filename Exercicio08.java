package pooatividade01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int matriz[][] = new int[8][4];
        int i, j;
        
        System.out.println("Digite os valores da matriz 8x2 -- dê espaços e pule linhas conforme a ordem da matriz para facilitar a visualização:\n");
        
        for(i = 0; i < 8; i++) {
            for(j = 0; j < 2; j++) {
                matriz[i][j] = scan.nextInt();
            }
            matriz[i][2] = matriz[i][0] + matriz[i][1];
            matriz[i][3] = matriz[i][0] * matriz[i][1];
        }
        
        System.out.println("\nImpressão da matriz 8x2:\n");
        
        for(i = 0; i < 8; i++) {
            for(j = 0; j < 2; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz 8 x 4 -- soma dos valores das primeiras linhas para gerar a terceira coluna e a multiplicação dessas para gerar a quarta coluna:\n");
        
        for(i = 0; i < 8; i++) {
            for(j = 0; j < 4; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}