package arreglos;

public class corrimiento_izquierda {
    public static int MAX = 10;
    public static void main(String args[]){
    int arrentero []={1,2,3,4,5,6,7,8,9,10};
    int pos = 4;
    for(int i = 5; i>0;i--){
        correr_izquierda(arrentero,pos);
    }
    for(int i=0;i<MAX+1;i++){
    System.out.println("la posicion " + i + " tiene el valor de " + arrentero[i]);
    
    }
    }
    public static void correr_izquierda(int arrentero[], int pos){
        for(int i=pos;i<MAX-1;i++){
            System.out.println(arrentero[i] + " es igual a " + arrentero[i+1]);
            arrentero[i]=arrentero[i+1];
            }
       
    }  
    }

   


