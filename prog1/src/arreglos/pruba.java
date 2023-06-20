package arreglos;
public class pruba {
    public static int MAX = 11;

public static void main (String args[]){
    int[]array={0,3,2,0,1,2,0,7,8,6,0};
    int [] arraux={0,0,0,0,0,0,0,0,0,0,0};
    int n = 3;
    int j =0;
    int ini = 0;
    int fin = -1;

        while(ini<MAX){
        ini = buscar_ini(array,fin+1);
            if(ini<MAX){
            fin = buscar_fin(array, ini);
                if(((fin-ini)+1)==n){
                int finsec= buscar_fin(arraux, j);
                copiar_sec(array,arraux,ini,fin,finsec);
                }
            }
        }
        for(int i = 0; i<MAX;i++){
            System.out.print(arraux[i] + "|");
            
            }
    }
        public static int buscar_ini(int []array,int ini){
            while(ini<MAX && array[ini]==0){
            ini++;
            
            }
            return ini;
        
        }
        public static int buscar_fin(int[]array,int ini){
        while(array[ini]!=0){
        ini++;
        }
        return (ini-1);
        }

        public static void copiar_sec(int[]array, int []arraux, int ini, int fin, int finsec){
            while(ini<=fin){
            arraux[finsec+1] = array[ini];
            finsec++;
            ini++;
            }
            
        }

    }