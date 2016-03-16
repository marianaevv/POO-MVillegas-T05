/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.apoyoseducativos;

/**
 *
 * @author Mariana Villegas
 */
public abstract class Becas implements iBecas {
    public String nombre;
    private int promedio;
    private int puntaje;
        
    public Becas (String nombre, int promedio, int puntaje){
        this.nombre = nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setPromedio (int promedio){
        this.promedio = promedio;
    }
    public void  setPuntaje (int puntaje){
        this.puntaje= puntaje;
    }
    public String getNombre (){
        return this.nombre;
    }
    public int getPromedio (){
        return this.promedio;
    }
    public int getPuntaje (){
        return this.puntaje;
    }
    public void muestraDatos (){
        System.out.println("Esta es una impresión de datos desde una instanacia de la clase Persona "
                        + "\nNombre:" + this.nombre
                        + "\nPromedio: " + this.promedio
                        + "\nPuntaje: " + this.puntaje);
    }
    @Override
    public String getAdmision (){
        return
        "Tienes que estar admitido";
    }
    @Override
    public String getEntregarDocumentacion (){
        return
        "Tienes que entregar la siguiente documentacion:"
        + "\n Solicitud de admsion"
                + "\n Acta de nacimiento"
                + "\n Copia de tus calificaciones de los ultimos dos años escolare "
                + "\n curriculo"
                + "\n ensayo";
    } 
    @Override
    public String getRealizarPago(){
        return "El pago a realizar de preinscripcion es de $1300.00";
    }
}
