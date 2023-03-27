package prueba.de.banco;

public class CuentaAhorro extends CuentaBase {

    public CuentaAhorro(double apertura) {
        this.setMontoActual(apertura);
    }

    public void invertir(double cantidad) {
        this.setMontoActual(this.getMontoActual() * 1.10);
    }


}
