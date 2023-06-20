package arreglos;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class punto11 {
    public static int MAX = 10;
    public static int numero;
    public static int pos;
    public static void main (String args[]){
    int arreglo[]={2,4,7,6,8,5,1,3,0,9};
    numero = obtener_numero();
    
    pos = buscar_pos(arreglo,numero);
    for(int i = 0; i<MAX;i++){
    System.out.println("el arreglo en posicion " + i + "tiene el valor " + arreglo[i]);
    }
    
    }
    public static int obtener_numero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese un numero entero para eliminarlo(si existe) del arreglo");
        numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception e){
        System.out.println("error" + e);

        }
        return numero;
    }
    public static void correr_izquierda(int[] arreglo, int pos){
    for(int i=pos;i<MAX-1;i++){
    arreglo[i]= arreglo[i+1];
    }
}
    public static void correr_derecha(int[] arreglo, int pos){
        for(int i=MAX-1;i>pos;i--){
        arreglo[i]= arreglo[i-1];
        }
    }
    public static int buscar_pos(int arreglo[], int numero){
    for(int i = 0; i<MAX; i++){
    if((arreglo[i]==numero)&&(i<MAX)){
        pos=i;
        correr_izquierda(arreglo, pos);
    }
    if(i==(MAX-1)){
        pos=i;
        correr_derecha(arreglo, pos);
    }
   
        }
    return pos;
 
    
    }
}

