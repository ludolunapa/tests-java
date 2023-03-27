package prueba.de.banco;

public class TarjetaDebito extends CuentaBase {

    public TarjetaDebito(double apertura) {
        this.setMontoActual(apertura);
    }

    public void retirar(double cantidad) {
        this.setMontoActual(this.getMontoActual() - cantidad);
    }


}
