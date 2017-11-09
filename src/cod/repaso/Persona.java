
package cod.repaso;


public class Persona {
    
    private String nombre;
   
    public Persona(){
    }
    public Persona(String nom){
        nombre=nom;   
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
}
