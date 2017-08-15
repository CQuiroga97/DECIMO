
public class Otra_clase {//Esta es una clase cualquiera, puede tener metodos y variables
   String Cantante;//Variable global
    public void Cantar( String Cancion){//Aca comienza el metodo de la clase "Otra Clase", dentro de sus argumentos he creado un dato llamado Cancion
        Cantante = "Pepito";
        System.out.println(Cantante + " cantara " + Cancion);
    
   }
    
    public void Numeros(int a){
        int b = 2;//Esta es una constante
        int R = a + b;
        System.out.println("Pepito suma "+ a + " Mas "+ b  + " con un resultado de " +R);
    }
    
}
