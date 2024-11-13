
package Taller1;

/**
 *
 * @author altoc
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;
   
    
    
    //contructor por defecto
    public CuentaBancaria(){
   }
    
    //constructor parametrizado con dos parametros
    public CuentaBancaria(int numeroCuenta, String tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.tipoCuenta=tipoCuenta;
    }
    
    //constructor sobrecargado con tres parametros
    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.tipoCuenta=tipoCuenta;
    }
    
    @Override
    public String toString(){
        return "\n **Cuenta Bancaria: Numero="+ numeroCuenta +", Saldo="+ saldo +", Tipo="+ tipoCuenta +"";
    }
}
