package tutorial.poo;

public class Documento {

    private int numero;
    private String nombre;
    private String direccion;
    
  
    Documento(int numero, String nombre, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    

    public String getDireccion(){
        return this.direccion;
    }
    


}
