    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    /* Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números.*/
    public class punto9tp3 {
    public static void main(String[] args){  
        int numero=obtenerNumero();
        int numero2=obtenerNumero2();
        char caracter=obtenerCaracter(); 
        operacion(numero, numero2, caracter); 
    }

    

  
    public static int obtenerNumero(){    
    int numero = -1;
        try{
            while((numero<1)) {
            System.out.println("ingresar un numero entero");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            numero = Integer.valueOf(entrada.readLine());
        }
    }
    
        catch (Exception e) {
            System.out.println(e);
        }
    return numero;        
    }

    public static int obtenerNumero2(){    
        int numero2 = -1;
            try{
                while((numero2<1)){
                System.out.println("ingresar un numero ENTERO NUEVO");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            numero2 = Integer.valueOf(entrada.readLine());
            }
        }
            catch (Exception e) {
                System.out.println(e);
            }
        return numero2;        
        }
    public static char obtenerCaracter(){
    char caracter = '0';
    try{
    
    while((caracter!='a') && (caracter!='b') && (caracter!='c') && (caracter!='d')){
    System.out.println("ingrese un caracter entre a y d");
    BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
    caracter = entrada.readLine().charAt(0);
    }
}
    catch(Exception e){
    System.out.println(e);
    }
    
    return caracter;
}
public static void operacion (int numero, int numero2, char caracter){
    
    switch(caracter){
    case 'a': System.out.println(numero+numero2);
    break;
    case 'b': System.out.println(numero-numero2);
    break;
    case 'c': System.out.println(numero*numero2);
    break;
    case 'd': System.out.println(numero/numero2);
    break;
    default: System.out.println("el caracter ingresado no es una operacion matematica");
    }
}
    }


