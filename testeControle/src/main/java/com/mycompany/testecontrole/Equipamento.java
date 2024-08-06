package com.mycompany.testecontrole;

public class Equipamento {
    private int pk_equipamento;
    private String modelo;
    private String tipo;
    
    public Equipamento() {
        
    }

    public Equipamento(int pk_equipamento, String modelo, String tipo) {
        this.pk_equipamento = pk_equipamento;
        this.modelo = modelo;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}
	
	