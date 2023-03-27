package prueba.de.banco;

public class TarjetaCredito extends CuentaBase {

    public TarjetaCredito(double apertura) {
        this.setMontoActual(apertura * -1);
    }

    public void sumaInteres(double cantidad) {
        double montoActual = this.getMontoActual();
        this.setMontoActual(montoActual * 1.15);
    }


}
