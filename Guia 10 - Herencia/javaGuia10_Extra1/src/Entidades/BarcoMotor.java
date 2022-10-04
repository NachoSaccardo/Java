
package Entidades;

import java.util.Calendar;


public class BarcoMotor extends Barco
{
    protected int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, Integer matricula, Integer eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString()+" BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }
    
}
