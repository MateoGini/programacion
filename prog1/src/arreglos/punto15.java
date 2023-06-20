package arreglos;
/* Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.  */

public class punto15 {
    public static int MAX=20;
    public static int pos = 0;
    public static void main (String args[]){
    int arr []={0,1,7,3,0,2,3,0,1,0,2,6,4,0,2,2,0,2,6,0};
    int ini = obtener_inicio(arr,pos);
    int fin = obtener_fin(arr,ini);
    System.out.println("la primer secuencia comienza en la posicion " + ini + " y termina en la " + fin );
    }

    public static int obtener_inicio(int [] arr, int pos){
        while((pos<MAX)&&(arr[pos]==0)){
        
            pos++;
        }
    
    
    return pos;
    }
    public static int obtener_fin(int [] arr, int ini){
    while(arr[ini]!=0){
        ini++;
    
    }
    return (ini-1);
    
    
    }












}
