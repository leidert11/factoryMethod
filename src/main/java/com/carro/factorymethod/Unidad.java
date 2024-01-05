package com.carro.factorymethod;

public interface Unidad {
    
    void  mover();
    void atacar();
    int getVida();
    void setVida(int vida);
    int getAtaque();
    void setAtaque(int ataque);
    int getCantidadDePersonalEnUnidad();
    void setCantidadDePersonalEnUnidad(int cantidad);
    
}
