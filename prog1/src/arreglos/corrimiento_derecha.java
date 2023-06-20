package arreglos;
/*7. Implementar un método que realice un corrimiento a derecha en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */
public class corrimiento_derecha {
    public static int MAX = 10;
    public static void main(String args[]){
    int arrentero []={1,5,8,3,6,9,3,6,0,3};
    int pos = 4;
    correr_derecha(arrentero,pos);
    for(int i=0;i<MAX-1;i++){
    System.out.println("la posicion " + i + " tiene el valor de " + arrentero[i]);
    
    }
    }
    public static void correr_derecha(int arrentero[], int pos){
    for(int i=MAX-1;i>pos;i--){
    System.out.println(arrentero[i] + " es igual a " + arrentero[i-1]);
    arrentero[i]=arrentero[i-1];
    }
    
    }
   
}
