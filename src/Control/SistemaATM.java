
package Control;


public class SistemaATM {
    
    public static double saldoActual;
    
    public SistemaATM(){
        saldoActual = 0;
    }
    
    public void depositar(double deposito){
        saldoActual += deposito;
    }
    
    public void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -= retiro;
        }
        else{
            
        }
    }
    
    public double obtenerSaldo(){
        return saldoActual;
    }
    
}
