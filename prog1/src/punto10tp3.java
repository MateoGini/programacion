
import java.io.BufferedReader;
import java.io.InputStreamReader;
 /* Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter, y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el caracter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el caracter es una letra del
abecedario en mayúscula;
iii. “dígito” si el caracter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado.  */
public class punto10tp3 {
    public static void main (String[] args){
    int numero = obtenerNumero();
    imprimir(numero);
    }


    public static int obtenerNumero(){    
        int numero = -2;
        try{
            while((numero<1) || (numero>10)){
            System.out.println("ingresar un numero entre 1 y 10");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            numero = Integer.valueOf(entrada.readLine());
        }
    }
    
        catch (Exception e) {
            System.out.println(e);
        }
    return numero;        
    }
    public static void esmultiplode3(int numero){
        char caracter = ' ';
           try{ System.out.println("ingrese un caracter");
            BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
            caracter = entrada.readLine().charAt(0);
            if((caracter>='a') && (caracter<='z')){
                System.out.println("es una letra minuscula");
            }
            else if((caracter<='A') && (caracter<='Z')){
                System.out.println("es una letra masyucula");
            }
            else if((caracter>='0')&&(caracter<='9')){
                System.out.println("es un digito");
            }
            else{
            System.out.println("Es otro");
            }
            }
            catch (Exception e){
            System.out.println(e);
            }
            
    }
    public static void esmultiplode5(int numero){
            for (int i=1; i<11; i++){
            System.out.println(numero*i);
            }
    }
    
    public static void imprimir(int numero){
        if(numero%3==0){
        esmultiplode3(numero);
        }
        else if(numero%5==0){
        esmultiplode5(numero);
        }
        else{
        System.out.println("no es multiplo de 3 ni de 5");
        }
}

}
