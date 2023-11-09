/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author User
 */
public class BotonOperador extends Boton{
    
    
    public static void asginacionOperador(){
    
        switch(Boton.id){
        
            case "1":
                
                Boton.operador="suma";
                break;
        
            case "2":
                
                Boton.operador="resta";
                break;
                
                
        
            case "3":
                
                Boton.operador="multiplicacion";
                break;
                
                
        
            case "4":
                
                Boton.operador="division";
                break;
                
                
        
        
        
        }
    
    }
    
}
