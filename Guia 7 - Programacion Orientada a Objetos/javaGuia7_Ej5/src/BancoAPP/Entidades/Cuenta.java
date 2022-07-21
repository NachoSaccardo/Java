package BancoAPP.Entidades;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private float tasaInteres;
    
    public Cuenta(int numeroCuenta, long dni, double saldoActual, float tasaInteres) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.tasaInteres = tasaInteres;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public float getTasaInteres() {
        return tasaInteres;
    }
    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", tasaInteres=" + tasaInteres + '}'+"\n";
    }
    
    
}
