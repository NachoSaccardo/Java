
package Entidades;

public class Yate extends BarcoMotor
{
    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potenciaCV) {
        super(potenciaCV);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potenciaCV, Integer matricula, Integer eslora, Integer anoFabricacion) {
        super(potenciaCV, matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return super.toString()+" Yate{" + "Camarotes=" + camarotes + '}';
    }
    
    
    
}
