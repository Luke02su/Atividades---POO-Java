package com.mycompany.aulapoo6;

public class AulaPoo6 {

    public static void main(String[] args) {
        
        Conta a = new Conta ("Lucas", 0);
        
        Conta b = new Conta ("Maria", 0);
        
        System.out.println("Total de contas: " + a.getNumTotalContas()); // precisa de um objeto para chamar, se fosse objeto b imprimiria a mesma qtd 2, pois é da classe
        
        Conta.totalContas(); // método da classe, não de um objeto específico, não precisa chamar nenhum objeto, nem instanciar
        
        // classe static (todos atributos e métodos daquela classe viram estáticos)
        
        System.out.println(Conta.NOME_BANCO); // atributo não poderá ser alterado, método não poderá ser alterado e classe não poderá ser estendida (extends), ser pai para outra classe
        
        // método final não pode sofrer polimorfismo (sobreposição e sobrecarga)
    }
}
