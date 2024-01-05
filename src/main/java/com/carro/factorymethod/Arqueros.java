package com.carro.factorymethod;

public class Arqueros implements Unidad{

    private int vida;
    private int ataque;
    private int cantidadDePersonalEnUnidad;

    public Arqueros(int vida, int ataque, int cantidadDePersonalEnUnidad) {
        this.vida = vida;
        this.ataque = ataque;
        this.cantidadDePersonalEnUnidad = cantidadDePersonalEnUnidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCantidadDePersonalEnUnidad() {
        return cantidadDePersonalEnUnidad;
    }

    public void setCantidadDePersonalEnUnidad(int cantidadDePersonalEnUnidad) {
        this.cantidadDePersonalEnUnidad = cantidadDePersonalEnUnidad;
    }

    
    
    @Override
    public void mover() {
        System.out.println("moviendose los arqueros");
    }

    @Override
    public void atacar() {
        System.out.println("atacando los arqueros");
    }
    
}
