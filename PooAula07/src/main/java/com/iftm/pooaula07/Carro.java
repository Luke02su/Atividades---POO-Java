package com.iftm.pooaula07;

public class Carro { // dentro de um objeto pode-se ter outros objetos (associação: agregação e composição). 
    //Na hora da programação associação simples e agregação são iguais.
    
    private Motor m; // composição
    private Multimidia mm; // agregação
    private Motorista pessoa; //associação simples
    private String marca;

    public Carro(String marca, int potencia) { // multimidia e motoritsa não precisa estar no construtor para criar objeto carro [passando parâmetro de Motor]8
        this.marca = marca;
        this.m = new Motor (potencia); // necessário criar objeto (composição)
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getM() {
        return m;
    }

    public void setM(Motor m) {
        this.m = m;
    }

    public Multimidia getMm() {
        return mm;
    }

    public void setMm(Multimidia mm) {
        this.mm = mm;
    }

    public Motorista getPessoa() {
        return pessoa;
    }

    public void setPessoa(Motorista pessoa) {
        this.pessoa = pessoa;
    }
    
    public void imprimir() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Potência: " + this.m.getPotencia());
        System.out.println("Motorista: " + this.pessoa.getNome());
        System.out.println("Multimídia: " + this.mm.getTamanhotela());
    }
  
}
