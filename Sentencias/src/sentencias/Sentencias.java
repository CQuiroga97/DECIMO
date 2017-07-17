/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import javax.swing.JOptionPane;

/**
 *
 * @author CristianDavid
 */
public class Sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //UN COMENTARIO SE INICIA CON DOBLE SLASH "//", SIRVE PARA ESCRIBIR SOBRE EL CODIGO SIN AFECTAR EL PROYECTO, SI SE QUITAN ESTOS SLASH EN ESTA LINEA APARECERA EN ROJO!
  
     //nombre de la clase
        //| Esta es una variable, por lo tanto se le puede asignar cualquier nombre
        //|    |      Por ultimo se llama la clase de nuevo
        //|    |           |
        //v    v           v
        Suma Clase = new Suma();
        Clase.Sumar();//En esta linea se INSTANCIA el metodo de la clase, se pone el nombre de la variable asignada a la clase + un punto + el nombre del metodo con parentesis finales
        
        
    }
    
}



class Suma{//CREACION DE LA CLASE
    
    int Numero1, Numero2, Resultado;//CREACION DE LAS VARIABLES O ATRIBUTOS
    
    public void Sumar(){
        
        Numero1 = 1;//SE LE DAN LOS VALORES A LAS VARIABLES
        Numero2 = 1;//PUEDEN CAMBIAR LOS NUMERO PARA CAMBIAR EL RESULTADO
        Resultado = Numero1 + Numero2;        
 //PRIMERA SENTENCIA: IF & ELSE       
        if(Resultado > 2){//SI LA VARIABLE RESULTADO ES MAYOR A 2, NOS LA MOSTRARA EN LA PANTALLA
            
                    JOptionPane.showMessageDialog(null, Resultado);//CODIGO PARA IMPRIMIR UN CUADRO DE DIALOGO
            
        }else{//SI NO, IMPRIMIRA UN MENSAJE DIFERENTE
            JOptionPane.showMessageDialog(null, "EL RESULTADO ES MENOR A 2");
        }
    }
}