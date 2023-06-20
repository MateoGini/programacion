package arreglos;
/* Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.*/
public class punto14 {
    public static int MAX = 10;
    public static int pos;

    public static void main (String args[]){
        int arr []={1,45,67,23,40,16,10,64,10,21};
        encontrar_pares(arr);
    for(int i = 0; i<MAX;i++){
    System.out.println("el arreglo en posicion " + i + "tiene el valor " + arr[i]);
    }
    }
        public static void encontrar_pares(int arr[]){
            int i = 0;
            while(i<MAX){
                if(arr[i]%2==0){
                    pos=i;
                correr_izquierda(arr, pos);
                }
                
                 else{
                    i++;
                     }
             }
       
        }
        public static void correr_izquierda(int[] arreglo, int pos){
            for(int i=pos;i<MAX-1;i++){
            arreglo[i]= arreglo[i+1];
            }

        }
    
    }

