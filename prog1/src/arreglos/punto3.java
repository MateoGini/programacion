package arreglos;
/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.*/
public class punto3 {
    public static int MAX=10;
    public static int MIN=0;
    public static void main(String args[]){
    char archar[]={'A','B','C','D','F','G','H','Y','J','K'};
    invertir_array(archar);
    
    }
    public static void invertir_array(char archar[]){
       //crea un nuevo arreglo con los mismas posiciones
        char aux[]=new char[archar[MAX-1]];
       // pone en el primer lugar, lo que se encuentra ultimo en el otro
        for(int ultimo = MAX-1, primero = MIN; ultimo>=MIN;ultimo--,primero++){
        aux[primero]=archar[ultimo];
        System.out.println("la posición " + primero + "es " + archar[ultimo]);
        }
    

    }
    }

