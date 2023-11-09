/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import static java.lang.Float.parseFloat;

/**
 *
 * @author User
 */
public class Funcion {
    
    public static float memoria;
    
    public static void sumarMemoria(){
        
        memoria=memoria+ parseFloat(FrameCalculadora.jTextField1.getText());
        
        System.out.print(memoria);
    }
    
    public static void restarMemoria(){
        
        memoria=memoria- parseFloat(FrameCalculadora.jTextField1.getText());
        
        System.out.print(memoria);
    }
    
    public static void recuperarMemoria(){
    
        FrameCalculadora.jTextField1.setText(Float.toString(memoria));
        FrameCalculadora.cadena= FrameCalculadora.cadena + Float.toString(memoria);
    }
    
    public static void borrarMemoria(){
    
        memoria=0;
    
    }
    
    
    
    public static void borrar(){
        
        //FrameCalculadora  FrameCalculadora = new FrameCalculadora();
        //No necesitamos instanciar framecalculadora porque ocupamos static en el atributo de cadena
        FrameCalculadora.jTextField1.setText(" "); 
        FrameCalculadora.jTextField2.setText(" "); 
        FrameCalculadora.cadena="";
        System.out.println("boton c funcionando");
               
        
        
    }
    
    
   /* public static void operador(){
        
        
        
       
       
       //ocuparemos el if para saber si ya se pulsó el signo de operacion o aun no
       if(FrameCalculadora.operador.equals("")){
           
           if (FrameCalculadora.cadena.equals("")){
               
            FrameCalculadora.cadena=FrameCalculadora.cadena+FrameCalculadora.id;       
        }
        
        else{
            FrameCalculadora.cadena="";
            FrameCalculadora.cadena=FrameCalculadora.cadena+FrameCalculadora.id;
        }
       }
       else{
       FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText()+ FrameCalculadora.cadena+" + ");
       }
       
       
    }*/
    
    
    
    
    
}
