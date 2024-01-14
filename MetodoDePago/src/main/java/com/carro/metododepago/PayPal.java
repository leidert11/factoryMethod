package com.carro.metododepago;

public class PayPal implements IFormaPago {

    private String numero;
    private String password;

    public PayPal(String numero, String password) {
        this.numero = numero;
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String pagar(double monto) {
        return "se a agado el monto "+monto+" con PayPal";
    }
    
}
