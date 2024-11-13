
package Taller1;

/**
 *
 * @author altoc
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    
    
    // contructor por defecto
    public Libro(){
  
    }
    
    
    // contructor con parametros con valores 
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo=titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    //metodo para mostrar informacion de la clase
     public void mostrarDetalles() {
         System.out.println("Titulo: "+ this.titulo);
         System.out.println("Autor: "+ this.autor);
         System.out.println("Numero de Paginas: "+ this.numeroPaginas);
     }
     
     @Override
     public String toString(){
         return "Libro: Titulo="+ titulo +", Autor= "+ autor + ", Numero de Paginas="+ numeroPaginas; 
         
     }
}
