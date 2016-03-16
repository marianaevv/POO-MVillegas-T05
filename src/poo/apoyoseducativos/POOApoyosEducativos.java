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
        
        
        System.out.println(becadta.getNombre() +"\n" +becadta.getPromedio()+"\n"+becadta.getPuntaje());
        System.out.println(becadta.getAdmision() +"\n" + becadta.getRealizarPago() + "\n" + becadta.getEntregarDocumentacion());
        
      
        BecasProf becase = new BecasProf("", 0, 0);
        
        becase.setNombre("Socioeconomica");
        becase.setPromedio(85);
        becase.setPuntaje(1300);
        
        System.out.println(becase.getNombre() +"\n"+becase.getPromedio() +"\n"+becase.getPuntaje());
        System.out.println(becase.getAdmision()+"\n" + becase.getRealizarPago() + "\n" + becase.getEntregarDocumentacion());
        
    }
    
    public static class BecasProf extends Becas {
        
        public BecasProf(String nombre, int promedio, int puntaje) {
            super(nombre, promedio, puntaje);
        }               
    }
    
    
}
