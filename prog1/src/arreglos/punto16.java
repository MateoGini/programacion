package arreglos;

public class punto16 {
        public static int MAX=20;
        public static int suma;
        public static int sumayor;
        public static void main (String args[]){
        int arr []={0,1,7,3,0,2,3,0,1,0,2,6,4,0,2,2,0,2,6,0};
        
        int ini = 0,fin=-1;
         while((ini<MAX)){
            ini = obtener_inicio(arr,fin+1);
         if(ini<MAX){
             fin = obtener_fin(arr,ini);
             sumayor= obtener_suma(ini,fin,arr);
             System.out.println("el inicio de la secuencia es " + ini + " el final es " + fin + " y la suma mayor es " + sumayor);
         }
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
            public static int obtener_suma(int ini, int fin, int []arr){
            for(int i = ini; i<=fin;i++){
            suma+=arr[i];
            }
            if(suma>sumayor){
                sumayor=suma;
                }
            return sumayor;
        
        }

       
       
}
