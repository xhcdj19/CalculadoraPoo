/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author User
 */
public class BotonNumero extends Boton {
    
    public static void imprimirNumero(){
        
        
        switch(Boton.id){
        
            case "1":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"1");
                
                break;
                
            case "2":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"2");
                
                break;
                
            case "3":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"3");
                
                break;
            case "4":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"4");
                
                break;
                
            case "5":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"5");
                
                break;
                
            case "6":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"6");
                
                break;
                
            case "7":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"7");
                
                break;
                
            case "8":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"8");
                
                break;
                
            case "9":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"9");
                
                break;
                
            case "0":
                
                 FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+"0");
                
                break;  
                
            case ".":
                
                FrameCalculadora.jTextField1.setText(FrameCalculadora.jTextField1.getText()+".");
                break;
        
        }
    
       
    
    
    }
    
}
