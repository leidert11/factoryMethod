package com.carro.metododepago;

public class FactoryFormaPago extends FactoriaFormaPago {

    @Override
    public IFormaPago crearFormaPago(String tipo) {
        switch (tipo) {
            case "efectivo":
                return new Efectivo();
            case "paypal":
                return new PayPal("leider@gmail.com","leidertami");
            case "tarjeta":
                return new Tarjeta("1234-5678-9012-3456", "123", "01/24");
            default:
                return null;
        }
    }
}


