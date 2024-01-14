package com.carro.municipios;

public class Municipio {
    private String nombre;
    private int poblacion;
    private double area;

    public Municipio(String nombre, int poblacion, double area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Municipio : " + '\n' + 
        "nombre : " + nombre + '\n' + 
        "poblacion : " + poblacion + '\n' +
        "area : " + area + '\n' +'\n';
    }


}
