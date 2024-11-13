
package Taller1;

import java.util.Scanner;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //cree el import de Scanner
        Scanner scanner = new Scanner(System.in);
        

        //LIBRO
        System.out.println("----LIBRO----");
        
        System.out.print("Ingresa titulo: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Ingresa autor: ");
        String autor = scanner.nextLine();
        
        
        System.out.print("Ingresa numero de paginas: ");
        int numeroPaginas =scanner.nextInt();
        scanner.nextLine(); //limpiador del buffer del salto de linea 
        
        Libro libro = new Libro(titulo, autor, numeroPaginas);
        libro.mostrarDetalles();
        //con toString
        //System.out.println("Detalles del libro: "+libro.toString());
        
    
        
        //ESTUDIANTE
        System.out.println("----ESTUDIANTE----");
        
        System.out.print("Ingresa nombre:  ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Ingrese el curso del estudiante: ");
        String curso = scanner.nextLine();
       
        //llame el constructor y mostre usando el metodo toString
        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        System.out.println("Detalles del Estudiante: " + estudiante.toString());
        
      
        //CUENTA BANCARIA
        System.out.println("---CUENTA BANCARIA---");
        
        System.out.print("Ingresa numero de cuenta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Ingresa el saldo actual: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Ingresa tipo de cuenta: ");
        String tipo = scanner.nextLine();
        scanner.nextLine();
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numero, saldo, tipo);
        System.out.println("Detalles Cuenta Bancaria: "+ cuentaBancaria.toString());
        
        
    }
    
}
