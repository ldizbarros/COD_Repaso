package cod.repaso;

import java.util.Scanner;

public class CODRepaso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre :)");
        String nombre = sc.next();
        System.out.println("Introduce tu edad :)");
        int edad = sc.nextInt();
        
        Persona p1 = new Persona(nombre, edad);
        
        
        System.out.println("Hola "+p1.getNombre());
        
        p1.cumpleaños(edad, nombre);
    }
    
}
