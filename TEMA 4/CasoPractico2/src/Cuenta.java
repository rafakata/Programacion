import java.util.Scanner;

public class Cuenta {
    private String ncuenta;
    private int saldo;
    private Persona propietario;
    Scanner sc = new Scanner(System.in);

    public Cuenta(String ncuenta, int saldo, Persona propietario) {
        this.ncuenta = ncuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public Cuenta() {

    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "ncuenta='" + ncuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }

    public void transaccion(double cantidad, int tipotrans) {
        do {
            System.out.println("¿Qué desa hacer? Introduzca 1 si desea hacer un reintegro y 2 si quiere hacer un ingreso:");
            tipotrans = sc.nextInt();
        } while (tipotrans < 1 || tipotrans > 2);
        if (tipotrans == 1) {
            System.out.println("Introduzca la cantidad que desea sacar: ");
            cantidad = sc.nextDouble();
            if (cantidad > saldo) {
                System.out.println("No tienes tanto dinero.");
            } else {
                double reintegro = saldo - cantidad;
                System.out.println("El saldo actual es: " + reintegro + "€");
            }
        } else {
            do {
                System.out.println("Introduzca cuánto dinero quiere ingresar:");
                cantidad = sc.nextDouble();
            } while (cantidad <= 0);
            double ingreso = saldo + cantidad;
            System.out.println("El saldo actual es: " + ingreso + "€");
        }


    }
}
