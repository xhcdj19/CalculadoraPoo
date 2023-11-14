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
    
    public static String aux;
    public static String ultimo;//La variable ultimom la ocupamos para comprobar si el penultimo digito es un punto
    public static String ultimob;
    
    public static void guardarVariable(){
        //Esta función guarda los numero en la variable a y b según sea el caso
        //se puede hacer una optmizacion creando otra funcion para no repetir tantos if
    
     switch(Boton.id){
     
        case "1":
            /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+1;
                
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion en a");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "1";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
            
            
            
            
            
        }
        //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=1;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "1";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+1;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
            
             break;
        case "2":
            
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
             ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("")){ 
                
                aux=aux+2;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"2";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "2";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"2";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=2;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"2";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "2";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"2";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+2;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"2";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
            
            
             break;
        case "3":
            
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+3;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"3";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "3";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"3";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
         //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=3;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"3";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "3";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"3";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+3;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"3";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;
             
        case "4":
            
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+4;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"4";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "4";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"4";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
         //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=4;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"4";
           aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "4";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"4";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                
                 aux=aux+4;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"4";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;     
           
        case "5":
            
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+5;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"5";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "5";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"5";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
         //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=5;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"5";
            aux=Integer.toString((int)Calculadora.b);
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "5";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"5";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+5;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"5";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;
             
        case "6":
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+6;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"6";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "6";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"6";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
            //Casos de b
         else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=6;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"6";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "6";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"6";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
             break;
             
        case "7":
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+7;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"7";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "7";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"7";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
         //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=7;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"7";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "7";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"7";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+7;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"7";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;
        case "8":
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("")){ 
                
                aux=aux+8;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"8";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "8";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"8";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
        //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=8;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"8";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "8";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"8";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+8;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"8";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
                
            
            
             break;
        
        case "9":
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+9;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"9";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "9";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"9";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
        //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=9;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"9";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "9";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"9";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+9;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"9";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;
         
        case "0":
            
             /*Las siguientes 2 lineas de codigo y el primer if sirven para cmprobar
            si el valor que le antecede al numero pulsado es un punto, para poder concatenarlo al punto
            y se puedan realizar operaciones con puntos decimales*/
            ultimo= (Float.toString(Calculadora.a)).substring((Float.toString(Calculadora.a)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor es "+ultimo);
            ultimob= (Float.toString(Calculadora.b)).substring((Float.toString(Calculadora.b)).length() - 2);//se pone -2 porque queremos saber si el penultimo valor es el punto
            System.out.println("El ultimo valor b es "+ultimob);
            /*En este if comprobamos que el ultimo valor de la cadena sea .0 y
            aparte que contenga algun numero a para poder entrar a este codigo porque si a no tiene nada
            no habría con que concatenarse despues de un punto*/
            if(ultimo.equals(".0") && Calculadora.a!=0 && (Boton.operador).equals("") ){ 
                
                aux=aux+0;
                Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"0";  
            System.out.println("El resultado de la concatenacion es "+aux);
                
                
            }
            
            else if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + "0";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"0";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
        }
        
        //Casos de b
            else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=0;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"0";
            aux=Integer.toString((int)Calculadora.b);
            
            
        }
            
            else if (Calculadora.b!=0 && !(ultimob.equals(".0")) ){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + "0";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"0";  
            System.out.println("El resultado de la concatenacion es "+aux);
            
                
            
            }
            //la ultima condicion es para< ver si se puso el punto en el ultimo digito de b           
            else if (Calculadora.b!=0 && ultimob.equals(".0")){
                 aux=aux+0;
                 
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"0";  
            System.out.println("El resultado de la concatenacion es "+aux);
            }
            
             break;
             
        case ".":
            if (Calculadora.a==0 || Boton.operador.equals("")){
                System.out.println("funciona la concatenacion");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.a) + ".";
           
            Calculadora.a= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+"."; 
            System.out.println("El auxiliar es "+ aux);
            System.out.println("El resultado de la concatenacion es "+Calculadora.a);
            
        }
        
         else if (Calculadora.b==0){
            FrameCalculadora.cadena="";
            Calculadora.b=0;
            
           
            System.out.println("b es igual a " + Calculadora.b);
            FrameCalculadora.cadena=FrameCalculadora.cadena+"1";
            
            
        }
            
            else if (Calculadora.b!=0){
                
                System.out.println("funciona la concatenacion en b");
               
            //Se crea una varibale auxiliar "aux" para poder concatenar un numero a la variable a y poder hacer un numero más grande 
            //hay que convertir a int la variable a porque si se concatena como su estado natural que es float, se concatena despues del punto decimal
            
            aux= Integer.toString((int)Calculadora.b) + ".";
           
            Calculadora.b= (Float.parseFloat(aux));
            FrameCalculadora.cadena=FrameCalculadora.cadena+".";  
            System.out.println("El resultado de la concatenacion es "+Calculadora.b);
            
                
            
            }
            break;
             
             
     }
    }
    
}
