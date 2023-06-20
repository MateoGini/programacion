import java.io.BufferedReader;
import java.io.InputStreamReader;
  /* Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números.. */
  public class App {
      public static void main(String[] args) {
        char caracter = obtenercaracter();
        tabladel10(caracter);
      }

      public static char obtenercaracter(){
        char caracter = ' ';
        try{
          System.out.println("Ingrese un caracter");
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
          caracter = entrada.readLine().charAt(0);

        }
        catch (Exception e){
        System.out.println(e);
        }
        return caracter;
      }
      public static void tabladel10(char caracter){
        if((caracter>'a') && (caracter<'z')){
          int suma= 0;
          int contador=200;
          for(int i=0; i<=contador; i++)
            System.out.println( suma=suma+(i+contador));
            contador--;
        }
        }
        
        }
    

  