package com.mycompany.datateste;
import java.util.Scanner;

public class DataTeste {

    public static void main(String[] args) {
        Data data1 = new Data(1, 1, 2024);
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Data pré-cadastrada:");
        data1.displayData();
        
        System.out.println("\nData cadastrada");
        data1.setDia(3);
        data1.setMes(8);
        data1.setAno(2023);
        data1.displayData();
        
        System.out.print("\nDigite um dia: ");
        int dia = scan.nextInt();
        data1.setDia(dia);
        
        System.out.print("Digite um mês: ");
        int mes = scan.nextInt();
        data1.setMes(mes);
        
        System.out.print("Digite um ano: ");
        int ano = scan.nextInt();
        data1.setAno(ano);
        
        System.out.print("\nData cadastrada manualmente: ");
        data1.displayData();
    }
}
