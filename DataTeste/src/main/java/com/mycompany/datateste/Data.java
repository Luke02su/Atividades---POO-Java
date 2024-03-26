package com.mycompany.datateste;

public class Data {
    private int mes;
    private int dia;
    private int ano;
    
    Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void displayData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
