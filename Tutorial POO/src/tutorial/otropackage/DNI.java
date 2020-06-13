package tutorial.otropackage;

public class DNI {

    private int numero;
    private String nombre;
    private String apellildo;
    private String direccion;

    public DNI(int numero, String nombre, String apellido, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellildo = apellido;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        String nombreCompleto = this.nombre + " " + this.apellildo;

        return nombreCompleto;
    }

    // getter and setter
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellildo;
    }

    public void setApellido(String apellido){
        this.apellildo = apellido;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
}
