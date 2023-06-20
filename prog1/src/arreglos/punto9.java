package arreglos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */
public class punto9 {
    public static int MAX = 10;
    public static int numero;
    public static void main (String args[]){
    int arreglo[]={2,4,7,6,8,5,1,3,0,9};
    numero = obtener_numero();
    correr_derecha(arreglo);
    arreglo[0]=numero;
    for(int i = 0; i<MAX;i++){
    System.out.println("el arreglo en posicion " + i + "tiene el valor " + arreglo[i]);
    }
    }
    public static int obtener_numero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese un numero entero para colocarlo en la posición 0");
        numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception e){
        System.out.println("error" + e);

        }
        return numero;
    }
    public static void correr_derecha(int[] arreglo){
    int pos = 0;
    for(int i=MAX-1;i>pos;i--){
    arreglo[i]= arreglo[i-1];
    }
    }
}
