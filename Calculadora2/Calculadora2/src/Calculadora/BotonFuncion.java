/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author User
 */
public class BotonFuncion extends Boton {
    
    public static void resultado(){
        
        switch(Boton.operador){
            
            case "suma":
                
                FrameCalculadora.jTextField1.setText(Float.toString(Suma.sumar()));
                FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText() +FrameCalculadora.cadena+ " = " + (Suma.sumar()) );
                break;
                
            case "resta":
                
                FrameCalculadora.jTextField1.setText(Float.toString(Resta.restar()));
                FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText()+FrameCalculadora.cadena+" = " + (Resta.restar()) );
                break;    
            case "division":
                
                if(Calculadora.a==0){
                    FrameCalculadora.jTextField3.setText("Error: No puedes dividir");
                }else{
                FrameCalculadora.jTextField1.setText(Float.toString(Division.dividir()));
                FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText()+FrameCalculadora.cadena+" = " + (Division.dividir()) );
                }
                break;    
            case "multiplicacion":
              
                FrameCalculadora.jTextField1.setText(Float.toString(Multiplicacion.multiplicar()));
                FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText()+FrameCalculadora.cadena+" = " + (Multiplicacion.multiplicar()) );
                break;
            /*case  "pot":
                Potencia Potencia = new Potencia (FrameCalculadora.a,FrameCalculadora.b);
                FrameCalculadora.jTextField1.setText(Float.toString(Potencia.operacion(FrameCalculadora.a,FrameCalculadora.b)));
                FrameCalculadora.jTextField2.setText(FrameCalculadora.jTextField2.getText()+FrameCalculadora.cadena+" = " + (Potencia.operacion(FrameCalculadora.a, FrameCalculadora.b)) );
        
             */
        }
        
    }
    
    
    
}
