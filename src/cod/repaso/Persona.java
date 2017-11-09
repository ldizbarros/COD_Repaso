
package cod.repaso;


public class Persona {
    
    private String nombre;
    private int edad;
   
    public Persona(){
    }
    public Persona(String nom, int edad){
        nombre=nom;   
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;  
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void saludo(String nombre){
        System.out.println("Hola "+nombre);
    }
    public void cumpleaños(int edad, String nombre){
        System.out.println("Hoy "+nombre+" cumple "+edad+" años!! :)");
    }  
}
