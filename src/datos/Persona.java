
package datos;

/**
 *
 * @author victo
 */
public class Persona {
    private double saldo;
    private String cuenta;
    private String datosPersonales;

    public Persona(double saldo, String cuenta, String datosPersonales) {
        this.saldo = saldo;
        this.cuenta = cuenta;
        this.datosPersonales = datosPersonales;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(String datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public static void main(String[] args) {
        // Puedes agregar código de prueba aquí si lo necesitas
    }
}


