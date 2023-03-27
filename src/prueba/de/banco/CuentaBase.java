package prueba.de.banco;

public class CuentaBase {

    private double montoActual;

    public double getMontoActual() {
        return montoActual;
    }
    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }


    public void depositar (double cantidad) {
        this.montoActual += cantidad;
    }


}
