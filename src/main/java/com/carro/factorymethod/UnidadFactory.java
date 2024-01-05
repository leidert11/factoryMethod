package com.carro.factorymethod;

public class UnidadFactory {
    public Unidad crearUnidad(String tipoUnidad , int vida, int ataque , int cantidadDePersonalEnUnidad){
        if (tipoUnidad == null) {
            return null;
        }
        if (tipoUnidad.equalsIgnoreCase("INFANTERIA")) {
            return new Infanteria(vida,ataque,cantidadDePersonalEnUnidad);
        }else if(tipoUnidad.equalsIgnoreCase("ARQUERIA")){
            return new Arqueros(vida,ataque,cantidadDePersonalEnUnidad);
        }else if(tipoUnidad.equalsIgnoreCase("CABALLERIA")){
            return new Caballeria(vida,ataque,cantidadDePersonalEnUnidad);
        }
        return null;
    }
}
