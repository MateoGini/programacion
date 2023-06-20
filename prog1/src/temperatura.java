import java.io.BufferedReader;
import java.io.InputStreamReader;

public class temperatura {
    
  public static void main(String[] args) {
    int mes;
    int anio;
    try{
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("ingrese un nro de mes");
      mes = Integer.valueOf(entrada.readLine());
      switch (mes){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
          System.out.println("el mes "+ mes + "tiene 31 dias");
        break;
        case 2:
          BufferedReader entradaanio= new BufferedReader(new InputStreamReader(System.in));
          System.out.println("ingrese anio");
          anio = Integer.valueOf(entradaanio.readLine());
          if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
            System.out.println("es anio bisiesto");
          } else{
            System.out.println("no es anio bisiesto");
          }
          break;

      default: System.out.println("tiene 30 dias");
    }
   }
    catch(Exception exc){
    }
 }
}

