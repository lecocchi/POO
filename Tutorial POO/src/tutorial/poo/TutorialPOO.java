package tutorial.poo;

public class TutorialPOO {

    public static void main(String[] args) {
        
        
        Documento documento1 = new Documento(1234,"Leandro", "fdsafsaf");
        Documento documento2 = new Documento(432,"Cocchi", "fdfdsa");
        Documento documento3 = new Documento(54654, "Sebastian", "jvfdsfds");
        
        documento1.setDireccion("Av Cabildo");
        documento1.setNombre("Santi");
        documento1.setNumero(12345678);
        
        System.out.println("El documento 1 tiene " + documento1.getNombre());
        System.out.println("El documento 1 tiene " + documento1.getNumero());
        System.out.println("El documento 1 tiene " + documento1.getDireccion());
        
        
    }

}
