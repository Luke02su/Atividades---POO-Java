package com.mycompany.testecontrole;

public abstract class Equipamento {
    private int pk_equipamento;
    private String modelo;
    
    public Equipamento() {
        
    }

    public Equipamento(int pk_equipamento, String modelo) {
        this.pk_equipamento = pk_equipamento;
        this.modelo = modelo;
    }
    
    public int getPk_equipamento() {
        return pk_equipamento;
    }

    public void setPk_equipamento(int pk_equipamento) {
        this.pk_equipamento = pk_equipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}