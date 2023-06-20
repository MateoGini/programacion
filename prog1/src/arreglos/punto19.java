package arreglos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/* Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.
pedir N
buscar secuencias
(si cumple con el tamaño, borrarla)

*/

public class punto19 {
    public static int MAX=20;
    public static void main (String args[]){
    int arr []={0,1,7,3,4,0,3,0,1,2,0,6,4,0,2,2,0,2,6,0};
    int numero = 0;
    int tamanio= 0;
    numero = obtener_numero(numero);
    int ini = 0,fin=-1;
    while((ini<MAX)){
        ini = obtener_inicio(arr,fin+1);
     if(ini<MAX){
         fin = obtener_fin(arr,ini);
         tamaño_secuencia(arr,ini,fin,tamanio,numero);
     }
    }
    for(int i = 0; i<MAX;i++){
    
    System.out.println(arr[i]);
    }
    }

    public static int obtener_inicio(int [] arr, int ini){
        
        while((ini<MAX)&&(arr[ini]==0)){
        
            ini++;
        }
    
    
        return ini;
    }
    public static int obtener_fin(int [] arr, int ini){
    while((ini<MAX)&&(arr[ini]!=0)){
        ini++;
    
    }
    return (ini-1);
    
    }
    


    public static int obtener_numero(int numero){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero");
        numero = Integer.valueOf(entrada.readLine());
        } catch (Exception e) {
        }
        return numero;
    }
    public static void tamaño_secuencia(int []arr, int ini, int fin,int tamaño, int numero){
    tamaño=(fin-ini+1);
    if(tamaño==numero){
    correr_izquierda(arr,ini,fin);
    }
    
    }
    public static void correr_izquierda(int arrentero[], int ini, int fin){
        while(ini<=fin){
            arrentero[ini]=arrentero[ini+1];
            ini++;
            }
       
    }  

}

