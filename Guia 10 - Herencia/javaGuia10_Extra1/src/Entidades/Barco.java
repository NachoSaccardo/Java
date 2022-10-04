/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Barco 
{
    protected Integer matricula;
    protected Integer eslora;
    protected Integer anoFabricacion;
    protected Usuario dueno;
    protected Amarre amarreocupado;
    protected Alquiler contratoAlquiler;


    public Barco() 
    {
        amarreocupado=null;
        contratoAlquiler=null;
    }

    public Barco(Integer matricula, Integer eslora, Integer anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Amarre getAmarreocupado() {
        return amarreocupado;
    }

    public void setAmarreocupado(Amarre amarreocupado) {
        this.amarreocupado = amarreocupado;
    }

    public Alquiler getContratoAlquiler() {
        return contratoAlquiler;
    }

    public void setContratoAlquiler(Alquiler contratoAlquiler) {
        this.contratoAlquiler = contratoAlquiler;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Usuario getDueno() {
        return dueno;
    }

    public void setDueno(Usuario dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Barco{\n" + 
                "Matricula: " + matricula + 
                "\nEslora: " + eslora + 
                "\nAño de Fabricacion: " + anoFabricacion + 
                "\nAmarre Ocupado: " + amarreocupado.getNumero() + 
                "\nContrato de Alquiler: "+ contratoAlquiler.getNumeroContrato() + 
                "\nDueño: "+dueno.getNombre()+" "+dueno.getApellido()+ '}';
    }
    
    public String mostrarBarco(){
        return "Barco{\n" + 
                "Matricula: " + matricula + 
                "\nEslora: " + eslora + 
                "\nAño de Fabricacion: " + anoFabricacion + 
                "\nDueño: "+dueno.getNombre()+" "+dueno.getApellido()+ '}';
    }
}
