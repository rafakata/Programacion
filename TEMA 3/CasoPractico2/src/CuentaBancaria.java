public class CuentaBancaria {
    private String NumeroCuenta;
    private double saldo = 0;
    public CuentaBancaria(String numeroCuenta, double saldo) {
        NumeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return NumeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Ha realizado un depósito de: "+deposito+"€");
    }
    public void retirar(double retirada) {
        if (retirada>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Ha realizado una retirada de "+retirada+"€");
            saldo -= retirada;
        }

    }
    public void mostrarSaldo() {
        System.out.printf("Su saldo es %.2f€\n", saldo);
    }
}
