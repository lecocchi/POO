package Pagos;

public class Pago {
    private String tipoPago;
    private double precioPago;


    //FORMAS DE PAGAR QUE HAY

    public void pagarConEfectivo(){
        System.out.println("Has pagado con efectivo.");
    }
    public void pagarConDebito(){
        System.out.println("Has pagado con tarjeta de credito.");
    }
    public void pagarConMercadoPago(){
        System.out.println("Has pagado con mercado pago.");
    }
    public void pagarConCredito(){
        System.out.println("Has pagado con tarjeta de credito.");
    }


    //GETTERS

    public double getPrecioPago() {
        return precioPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }
}
