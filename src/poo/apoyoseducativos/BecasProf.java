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
public class BecasProf extends Becas { 
    public String escprocedencia;
    public String credito;
    
     public BecasProf(String nombre, int promedio, int puntaje, String escprocedencia, String credito) {
        super(nombre, promedio, puntaje);
        
           }
     
     public void setEscuela (String escprocedencia){
         this.escprocedencia= escprocedencia;
     } 
     public String getEscuela (){
         return this.escprocedencia;
     }
     public void setCredito (String credito){
         this.credito = credito;
     }
     public String getCredito (){
         return this.credito;
     }
     
    
}
