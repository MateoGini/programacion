package arreglos;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;;

    public class arreglos {
        public static final int MAX = 15;

        public static void main (String args[]){
            int arrenteros []= new int [MAX];
            cargar_arreglo(arrenteros);
            for(int i = 0; i<MAX;i++){
        System.out.println(arrenteros[i]);
        }
    }
        public static void cargar_arreglo(int[] arrenteros){
        try{
        int valor = 0;
         for(int i=0; i<MAX;){
            
            while((valor<1)||(valor>12)){
            System.out.println("ingrese un numero entero entre 1 y 12 en la posicion " + i );
            BufferedReader entrada= new BufferedReader(new InputStreamReader (System.in));
            valor = Integer.valueOf(entrada.readLine());
            }
            
            arrenteros[i]= valor;
            i++;
            valor=0;
        
        }   
    }
        catch (Exception e){
        System.out.println(e);
        }

        }
        }
