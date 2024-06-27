package com.mycompany.testeanimal;

public class Tubarao extends Animal {
    
    private String tipoAgua;
    private String carcaca;
    private boolean pula;

    public Tubarao(String tipoAgua, String carcaca, boolean pula, String cor, int qtdPatas, int qtdOlhos, String alimentacao, int idade) {
        super(cor, qtdPatas, qtdOlhos, alimentacao, idade);
        this.tipoAgua = tipoAgua;
        this.carcaca = carcaca;
        this.pula = pula;
    }
    
    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getCarcaca() {
        return carcaca;
    }

    public boolean isPula() {
        return pula;
    }

    public void setPula(boolean pula) {
        this.pula = pula;
    }

    public void setCarcaca(String carcaca) {
        this.carcaca = carcaca;
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }
    
    @Override
    public void comer() {
        System.out.println("Peixes pequenos.");
    }
    
    @Override
    public void emitirSom() {
       System.out.println("Tum, Tum, Tum.");
    }
   
    public void imprimirTubarao() {
        System.out.println("--- CARACTERÍSTICAS DO TUBARÂO ---");
        super.imprimirAnimal();
        System.out.println("Tipo de água: " + this.getTipoAgua());
        System.out.println("Tipo de carcaça: " + this.getCarcaca());
        System.out.println("Pula: " + this.isPula());
        System.out.println("---");
    }
}
