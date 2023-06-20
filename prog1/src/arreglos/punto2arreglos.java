package arreglos;
public class punto2arreglos {
public static int MAX=10;
public static int suma, valor, promedio, pares;
    public static void main (String args[]){
        int arreglo[]={1,3,5,7,9,7,5,2,3,4};
        obtener_pares(arreglo);
    }
    public static void obtener_pares(int[]arreglo){
    for(int i=0;i<MAX-1;i++){
    if(arreglo[i]%2==0){
    pares++;
    }
    }
    System.out.println("la cantidad de numeros pares que hay es " + pares);
    
    }
    }
    

