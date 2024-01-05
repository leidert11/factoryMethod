package com.carro.factorymethod;

public class Infanteria implements Unidad {

    private int vida;
    private int ataque;
    private int cantidadDePersonalEnUnidad;

    public Infanteria(int vida, int ataque, int cantidadDePersonalEnUnidad) {
        this.vida = vida;
        this.ataque = ataque;
        this.cantidadDePersonalEnUnidad = cantidadDePersonalEnUnidad;
    }

    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public int getCantidadDePersonalEnUnidad() {
        return cantidadDePersonalEnUnidad;
    }

    @Override
    public void setCantidadDePersonalEnUnidad(int cantidad) {
        this.cantidadDePersonalEnUnidad = cantidad;
    }
    
    

    @Override
    public void mover() {
        System.out.println("moviendose la infanteria");
    }

    @Override
    public void atacar() {
        System.out.println("atacando la infanteria");
    }
    
}
