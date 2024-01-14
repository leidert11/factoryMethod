package com.carro.metododepago;

public class Efectivo implements IFormaPago{

    @Override
    public String pagar(double monto) {
        return "se a pagado  "+monto+" en efectivo";
    }
}
