package pooatividade01;
import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int i, numeroAleatorio[] = new int[100];
        
        System.out.println("Cem números inteiros aleatórios:\n");
        
        for(i = 0; i < 100; i++) {
            numeroAleatorio[i] = random.nextInt(201) - 100;
            System.out.println(i+1 + "° número: " + numeroAleatorio[i]);
        }
    }
}