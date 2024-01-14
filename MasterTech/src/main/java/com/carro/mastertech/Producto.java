package com.carro.mastertech;

public class Producto {
    private String nombre;
    private double precio;
    private int numero; 
    private String referencia;
    private int cantidad; 
    private int cantidadDisponible; 
    Categoria categoría;

    public Producto(String nombre, double  precio, int numero, String referencia, int cantidad, int cantidadDisponible, Categoria categoría) {
        this.nombre = nombre;
        this.precio = precio;
        this.numero = numero;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.cantidadDisponible = cantidadDisponible;
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Categoria getCategoría() {
        return categoría;
    }

    public void setCategoría(Categoria categoría) {
        this.categoría = categoría;
    }

    

    @Override
    public String toString() {
        return "Producto :"  + '\n' +
                "nombre = " + nombre + '\n' +
                "precio = " + precio + '\n' +
                "numero = " + numero + '\n' + 
                "referencia = " + referencia + '\n' +
                "cantidad = " + cantidad + '\n' +
                "cantidadDisponible = " + cantidadDisponible + '\n' +
                categoría ;
    }

    
}
