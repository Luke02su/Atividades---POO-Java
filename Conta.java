package atividade2;

import java.util.Scanner;

public class Conta {
    private int numero;
    private String titular;
    private double valor;
    private boolean criado;
    private Scanner scan;

    public Conta(int numero, String titular, double valor) {
        this.numero = numero;
        this.titular = titular;
        this.valor = valor;
    }
    
        public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void criarConta() {
        System.out.print("\nDigite o número da conta: ");
        numero = this.scan.nextInt();
        this.setNumero(numero);

        this.scan.nextLine(); // quebra de linha para ler a string seguinte

        System.out.print("Digite o nome titular da conta: ");
        titular = this.scan.nextLine();
        this.setTitular(titular);

        char opcao = 's';
        while (opcao != 's' || opcao != 'n') {
            System.out.print("Há um depósito inicial (s/n)? ");
            opcao = this.scan.nextLine().charAt(0); // converte string em char;
            if (opcao == 's') {
                System.out.print("Digite o valor de depósito inicial: ");
                valor = this.scan.nextDouble();
                this.setValor(valor);
                break;
            } else if (opcao == 'n') {
                break;
            }
        }
        this.criado = true;
        this.imprimirDados();
    }

    public void imprimirDados() {
        System.out.println();
        if (!this.criado) {
            System.out.println("A conta não foi criada.\n");
        } else {
            System.out.println("Dados atualizados da conta:");
            System.out.print("Conta " + this.getNumero());
            System.out.print(", Titular: " + this.getTitular());
            System.out.printf(", Saldo: $ %.2f", this.getValor());
            System.out.println("\n");
        }
    }

    public void atualizarNome() {
        if (!this.criado) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            this.scan.nextLine();
            System.out.print("\nAltere o nome do titular: ");
            titular = this.scan.nextLine();
            this.setTitular(titular);
            this.imprimirDados();
        }
    }

    public void atualizarValor() {
        if (!this.criado) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            System.out.print("\nDigite um valor de depósito: ");
            valor = this.getValor();
            double valorDeposito = this.scan.nextDouble();
            valor += valorDeposito;
            this.setValor(valor);
            this.imprimirDados();
        }
    }

    public void sacarValor() {
        if (!this.criado) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            System.out.print("\nDigite o valor do saque: ");
            double saque = this.scan.nextDouble();
            if (this.getValor() < (saque + 5) || saque <= 0.00) { // taxa de 5 reais ao sacar
                System.out.print("\nOperação não realizada. Saldo insuficiente.");
            } else {
                valor = this.getValor();
                valor -= (saque + 5);
                this.setValor(valor);
            }
            this.imprimirDados();
        }
    }
}
