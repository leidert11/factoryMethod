package com.carro.metododepago;

public class Efectivo implements IFormaPago{
    
    @Override
    public String pagar(double monto) {
        if (monto < 0) {
            throw new IllegalArgumentException("el monto debe de ser mayor a cero");
        }
        return "se a pagado  "+monto+" en efectivo";
    }
}
