
package Taller1;

/**
 *
 * @author altoc
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;
    
    
    //contructor por defecto
    public Estudiante(){
    
    }
    
    //constructor parametrizado con nombre y edad
    public Estudiante( String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
   //constructor sobrecargado con todos los parametros
    public Estudiante(String nombre, int edad, String curso){
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
    }
    
    
    @Override
    public String toString() {
        return "\n **Estudiante: Nombre='" + nombre + "', Edad=" + edad + ", Curso='" + curso + "'";
    }
}
