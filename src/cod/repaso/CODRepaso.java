package cod.repaso;

import java.util.Scanner;

public class CODRepaso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre :)");
        String nombre = sc.next();
        
        Persona p1 = new Persona(nombre);
        
        System.out.println("Hola "+p1.getNombre());
    }
    
}
