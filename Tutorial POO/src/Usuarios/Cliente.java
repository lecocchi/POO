package Usuarios;


public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private double precioAPagar;

    public double getPrecioAPagar() {
        return precioAPagar;
    }

    public int getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}
