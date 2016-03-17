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
public class POOApoyosEducativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La informacion de la beca es la siguiente: ");
        
        BecasProf becadta = new BecasProf("", 0, 0);
        
        becadta.setNombre("DTA");
        becadta.setPromedio(90);
        becadta.setPuntaje(1400);
        becadta.setCredito("Tiene credito de acuerdo al puntaje de beca que se le proporcione");
                
        System.out.println(becadta.getNombre() +"\n" +becadta.getPromedio()+"\n"+becadta.getPuntaje()+ "\n"+ becadta.getCredito());
        System.out.println(becadta.getAdmision() +"\n" + becadta.getRealizarPago() + "\n" + becadta.getEntregarDocumentacion());
        
      
        BecasProf becase = new BecasProf("", 0, 0);
        
        becase.setNombre("Socioeconomica");
        becase.setPromedio(85);
        becase.setPuntaje(1300);
        
        System.out.println(becase.getNombre() +"\n"+becase.getPromedio() +"\n"+becase.getPuntaje());
        System.out.println(becase.getAdmision()+"\n" + becase.getRealizarPago() + "\n" + becase.getEntregarDocumentacion());
        
        BecasProf becaldm = new BecasProf("",0,0);
            
            becaldm.setNombre("Lideres del Mañana");
            becaldm.setPromedio(90);
            becaldm.setPuntaje(1400);
            becaldm.setCredito("No tiene credito, es 100% pura");
            
             System.out.println(becaldm.getNombre() +"\n"+becaldm.getPromedio() +"\n"+becaldm.getPuntaje()+ "\n"+ becaldm.getCredito());
        System.out.println(becase.getAdmision()+"\n" + becase.getRealizarPago() + "\n" + becase.getEntregarDocumentacion());
        }
    
    }
   
