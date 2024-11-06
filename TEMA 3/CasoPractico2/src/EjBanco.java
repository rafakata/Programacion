
public class EjBanco {
    public static void main(String[]args){
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 3500.75);
        CuentaBancaria cuenta2= new CuentaBancaria("987654321",2150.96);
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
        cuenta1.depositar(505.63);
        cuenta2.retirar(6500.36);
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

    }
}
