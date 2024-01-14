package com.carro.metododepago;

public class FactoryFormaPago extends FactoriaFormaPago {

    @Override
    public IFormaPago crearFormaPago(String tipo) throws FormaPagoNoSoportadaException {
        
        assert tipo !=  null : "no puede ser null";

        switch (tipo) {
            case "efectivo":
                return new Efectivo();
            case "paypal":
                return new PayPal("leider@gmail.com","leidertami");
            case "tarjeta":
                return new Tarjeta("1234-5678-9012-3456", "123", "01/24");
            default:
                throw new FormaPagoNoSoportadaException(tipo);
        }
    }
}
