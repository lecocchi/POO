package Productos;

public class Producto {
    private int id;
    private String productType;
    private boolean stockDisponible;
    private int cantidadStock;

    public int getID() {
        return id;
    }

    public String getProductType() {
        return productType;
    }

    public boolean getStockDisponible() {
        return stockDisponible;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}
