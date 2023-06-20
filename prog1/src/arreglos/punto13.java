package arreglos;
/* Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. */
public class punto13 {
    public static int MAX = 10;
    public static void main (String args[]){
    int posicion = 0;
    int numero = 25;
    int arrordenado[]={90,80,70,60,50,40,30,20,10,5};
    posicion = encontrar_posicion(arrordenado,numero,posicion);
    corrimiento_derecha(arrordenado,posicion, numero);
    for(int i = 0; i<MAX; i++){
    System.out.println(arrordenado[i]);
    
    }
    
    }
    public static int encontrar_posicion(int []arrordenado, int numero, int posicion){

    while((posicion<MAX)&& (numero<arrordenado[posicion])){
        posicion++;
        }
        return (posicion);
    }
    public static void corrimiento_derecha(int [] arrentero, int pos, int numero){
        for(int i=MAX-1;i>pos;i--){
            arrentero[i]=arrentero[i-1];
            }
            arrentero[pos]=numero;
    }

}
