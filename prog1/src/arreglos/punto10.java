package arreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */
public class punto10 {
    public static int MAX = 10;
    public static int numero;
    public static int pos;
    public static void main (String args[]){
    int arreglo[]={2,4,7,6,8,5,1,3,0,9};
    numero = obtener_numero();
    
    pos = buscar_pos(arreglo,numero);
    correr_izquierda(arreglo, pos);
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
    public static int buscar_pos(int arreglo[], int numero){
    for(int i = 0; i<MAX;){
    if(arreglo[i]==numero){
        pos=i;
        i=MAX;
    }
    else{
    i++;
    }
        }
    return pos;
 
    
    }
}
