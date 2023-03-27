import prueba.de.banco.CuentaAhorro;
import prueba.de.banco.TarjetaCredito;
import prueba.de.banco.TarjetaDebito;

public class Main {
    public static void main(String[] args) {

        TarjetaCredito tc = new TarjetaCredito(1500);
        TarjetaDebito td = new TarjetaDebito(1500);
        CuentaAhorro ca = new CuentaAhorro(1500);

        System.out.println("CONSHESUMARE");
        System.out.println(tc.getMontoActual());
        tc.depositar(500);
        System.out.println(tc.getMontoActual());
        tc.sumaInteres(0);
        System.out.println(tc.getMontoActual());

        System.out.println("LARRYCITO");
        ca.invertir(0);
        System.out.println(ca.getMontoActual());

        System.out.println("OE");
        td.retirar(500);
        System.out.println(td.getMontoActual());


        System.out.println("CREDITO ->" + tc.getMontoActual());
        System.out.println("DEBITO ->" + td.getMontoActual());
        System.out.println("AHORRO ->" + ca.getMontoActual());

    }
}