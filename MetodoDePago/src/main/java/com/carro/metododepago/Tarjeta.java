package com.carro.metododepago;

public class Tarjeta implements  IFormaPago{

    private String numero;
    private String cvv ;
    private String fecha;

    public Tarjeta(String numero, String cvv, String fecha) {
        this.numero = numero;
        this.cvv = cvv;
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String pagar(double monto) {
        return "se a pgado el monto "+monto+" con Tarjeta";
    }
    
}
