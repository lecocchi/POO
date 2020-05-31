package tutorial.poo;

import tutorial.otropackage.DNI;


public class TutorialPOO {

    public static void main(String[] args) {
        
        DNI documento1 = new DNI(1234,"Leandro", "Cocchi", "fdsafsaf");
        
        
        documento1.setNumero(789);
        
        System.out.println("El numero de documento es: " + documento1.getNumero());
        System.out.println("El nombre completo es: " + documento1.getNombreCompleto());
        
    }

}
