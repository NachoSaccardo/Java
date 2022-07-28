
package IdentiApp.Entidades;

public class NIF 
{
    private long DNI;
    private String letra;

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public NIF() {
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
    

}
